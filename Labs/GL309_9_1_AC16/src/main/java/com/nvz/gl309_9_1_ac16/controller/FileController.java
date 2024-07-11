package com.nvz.gl309_9_1_ac16.controller;

import com.nvz.gl309_9_1_ac16.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.util.Arrays;

//controller accepts HTTP request and returns responses accordingly
@Controller
public class FileController {
    @Autowired
    FileService fileService;

    @GetMapping("/")
    public String indexPage(){
        return "upload";
    }

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) throws IOException {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file");
            return "redirect:/";
        } else {
            fileService.uploadFile(file); //uploads the file
            redirectAttributes.addFlashAttribute("message", "File uploaded" + file.getOriginalFilename() + "file");
            return "redirect:/";
        }
    }

    // handler to upload multiple files, the difference is that it has MultipartFile[] as an argument
    @PostMapping("/uploadFiles")
    //MultipartFile is an object that has the file and its metadata details
    public String uploadFiles(@RequestParam("files") MultipartFile[] files, RedirectAttributes redirectAttributes) throws IOException {
        Arrays.asList(files)
                .stream()
                .forEach(file -> fileService.uploadFile(file));
        redirectAttributes.addFlashAttribute("message", "File uploaded");
        return "redirect:/";
    }
}
