package com.directi.training.dip.exercise_refactored;

import java.util.Base64;

public class EncodingModule
{
    private IReader _reader;
    private IWriter _writer;

    public EncodingModule(IReader reader, IWriter writer)
    {
        _reader = reader;
        _writer = writer;
    }

    public void encode()
    {
        String input = _reader.read();
        String encoded = Base64.getEncoder().encodeToString(input.getBytes());
        _writer.write(encoded);
    }
}
