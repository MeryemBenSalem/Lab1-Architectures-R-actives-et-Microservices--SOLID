package com.directi.training.dip.exercise_refactored;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CustomFileWriter implements IWriter
{
    private String _fileName;

    public CustomFileWriter(String fileName)
    {
        _fileName = fileName;
    }

    @Override
    public void write(String message)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(_fileName))) {
            writer.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
