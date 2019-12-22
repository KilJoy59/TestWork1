package main.service;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import main.util.FileUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Service
@Slf4j
public class FileService {

    private List<File> unzipFiles = new ArrayList<>();

    public void unZip(MultipartFile zipFile) throws IOException {
        File newFile = FileUtil.convert(zipFile);
        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(newFile))) {
            ZipEntry zipEntry;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                File unZippedFile = new File(zipEntry.getName());
                unzipFiles.add(unZippedFile);
                FileOutputStream fileOutputStream = new FileOutputStream(unZippedFile.getAbsolutePath());
                int len;
                byte[] content = new byte[1024];
                while ((len = zipInputStream.read(content)) > 0) {
                    fileOutputStream.write(content, 0, len);
                }
                fileOutputStream.close();
            }
            zipInputStream.closeEntry();
        }
    }

    public List<File> getUnzipFiles() {
        return unzipFiles;
    }

    public void parseXLSX(File file) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(file.getAbsolutePath()));
        XSSFSheet list = workbook.getSheetAt(0);
        Iterator<Row> iterator = list.iterator();
        while (iterator.hasNext()) {

            Row currentRow = iterator.next();
            Iterator<Cell> cellIterator = currentRow.iterator();

            while (cellIterator.hasNext()) {

                Cell currentCell = cellIterator.next();
                if (currentCell.getCellType() == Cell.CELL_TYPE_STRING) {
                    System.out.print(currentCell.getStringCellValue() + "--");
                } else if (currentCell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                    System.out.print(currentCell.getNumericCellValue() + "--");
                }

            }
            System.out.println();

        }

        }



}
