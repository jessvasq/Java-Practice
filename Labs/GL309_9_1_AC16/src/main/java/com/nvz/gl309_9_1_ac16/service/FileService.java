package com.nvz.gl309_9_1_ac16.service;

import com.nvz.gl309_9_1_ac16.FileStorageException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Service
public class FileService {
    //path to upload directory
    public String uploadDir = "C:\\Users\\downloads";
    public void uploadFile(MultipartFile file) {
        try {
            // creates a full path of the file
            //clean path is used to clean the path
            Path copyLocation = Paths.get(uploadDir + File.separator + StringUtils.cleanPath(file.getOriginalFilename()));
            Files.copy(file.getInputStream(), copyLocation, StandardCopyOption.REPLACE_EXISTING);

            String fileName = file.getOriginalFilename();
            int fileLength = file.getBytes().length;
            System.out.println("File uploaded: " + "File: " + fileName + ", File Length: " + fileLength);
        }
        catch (IOException e) {
            e.printStackTrace();
            throw new FileStorageException("File Not Found");
        }
    }
}
