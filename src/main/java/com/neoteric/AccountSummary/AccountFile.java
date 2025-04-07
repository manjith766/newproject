package com.neoteric.AccountSummary;

public class AccountFile {

    private String fileLocation;
    private String fileName;
    private String fileType;

    public AccountFile( String fileName) {
        this.fileLocation = fileLocation;
        this.fileName = fileName;

    }

    public String getFileLocation() {
        return fileLocation;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}
