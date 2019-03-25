package com.geekbrains.fileexchanger.command;

public class FileDelete extends AbstractMessage {

    private String filename;

    public String getFilename() {
        return filename;
    }

    public FileDelete(String filename) {
        this.filename = filename;
    }
}
