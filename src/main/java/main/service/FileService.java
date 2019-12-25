package main.service;

import main.model.Bank;
import main.model.Bill;
import main.util.FileUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Service
public class FileService {

    @Autowired
    BankService bankService;

    @Autowired
    BillService billService;

    @Autowired
    ReportService reportService;

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
            if (currentRow.getRowNum() != 0) {
                Iterator<Cell> cellIterator = currentRow.iterator();
                if (file.getName().equals(FileUtil.getBANK())) {
                    Bank bank = new Bank();
                    while (cellIterator.hasNext()) {
                        Cell currentCell = cellIterator.next();
                        int columnIndex = currentCell.getColumnIndex();

                        switch (columnIndex) {
                            case 0:
                                Double d = (Double) getCellValue(currentCell);
                                bank.setRegistrationAccountNumber(d.longValue());
                                bankService.save(bank);
                                break;
                            case 1:
                                bank.setOrganizationName((String) getCellValue(currentCell));
                                bankService.save(bank);
                                break;
                            default:
                                break;
                        }
                    }
                } else if (file.getName().equals(FileUtil.getBILL())) {
                    Bill bill = new Bill();
                    while (cellIterator.hasNext()) {
                        Cell currentCell = cellIterator.next();
                        int columnIndex = currentCell.getColumnIndex();

                        switch (columnIndex) {
                            case 0:
                                String d = (String) getCellValue(currentCell);
                                bill.setSecondAccountNumber(d);
                                billService.save(bill);
                                break;
                            case 1:
                                bill.setAccountName((String) getCellValue(currentCell));
                                billService.save(bill);
                                break;
                            default:
                                break;
                        }
                    }
                }
            }
        }

    }

    private Object getCellValue(Cell cell) {
        switch (cell.getCellType()) {
            case Cell.CELL_TYPE_STRING:
                return cell.getStringCellValue();
            case Cell.CELL_TYPE_NUMERIC:
                return cell.getNumericCellValue();
        }
        return null;
    }
}
