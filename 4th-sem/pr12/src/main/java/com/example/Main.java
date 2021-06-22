package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class Main {
    @Value("${file.input}")
    private String inputFileName;

    @Value("${file.output}")
    private String outputFileName;

    private final FileHelper fileHelper;

    @Autowired
    public Main(FileHelper fileHelper) {
        this.fileHelper = fileHelper;
    }

    @PostConstruct
    public void init() {
        if (fileHelper.isExistFile(inputFileName)) {
            String data = fileHelper.readFile(inputFileName);
            fileHelper.writeToFile(outputFileName, Integer.toString(data.hashCode()));
        } else {
            fileHelper.writeToFile(outputFileName, "null");
        }
    }

    @PreDestroy
    public void destroy() {
        if (fileHelper.isExistFile(inputFileName)) {
            fileHelper.deleteFile(inputFileName);
        }
    }
}
