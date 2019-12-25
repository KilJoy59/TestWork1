package main.controller;

import main.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.File;
import java.io.IOException;

@RestController
public class UploadController {

    @Autowired
    private FileService fileService;

    @PostMapping("/uploadFile")
    public ResponseEntity uploadFile(@RequestParam("file") MultipartFile multipartFile) {
        try {

            fileService.unZip(multipartFile);
            for (File file : fileService.getUnzipFiles()) {
                fileService.parseXLSX(file.getAbsoluteFile());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/downloadFile/")
                .toUriString();

        return ResponseEntity.ok(fileDownloadUri);
    }



}
