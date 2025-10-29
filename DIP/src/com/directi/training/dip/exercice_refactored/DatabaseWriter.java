package com.directi.training.dip.exercise_refactored;

public class DatabaseWriter implements IWriter
{
    private MyDatabase _myDatabase;

    public DatabaseWriter(MyDatabase myDatabase)
    {
        _myDatabase = myDatabase;
    }

    @Override
    public void write(String message)
    {
        _myDatabase.write(message);
    }
}
