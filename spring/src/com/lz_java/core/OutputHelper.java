package com.lz_java.core;

public class OutputHelper {
    IOutputGenerator outputGenerator;

    public OutputHelper() {
        outputGenerator = new CsvOutputGenerator();
    }

    public void generateOutput() {
        outputGenerator.generateOutput();
    }
}
