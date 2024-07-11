package com.nvz.gl309_9_1_ac16;

import lombok.Getter;
import lombok.Setter;

//custom exception for file handling
@Getter
@Setter
public class FileStorageException extends RuntimeException {
    private String msg;
    public FileStorageException(String msg) {
        this.msg = msg;
    }
}
