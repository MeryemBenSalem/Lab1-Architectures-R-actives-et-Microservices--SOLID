package com.directi.training.dip.exercise_refactored;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CustomFileReader implements IReader
{
    private String _fileName;

    public CustomFileReader(String fileName)
    {
        _fileName = fileName;
    }

    @Override
    public String read()
    {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(_fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
