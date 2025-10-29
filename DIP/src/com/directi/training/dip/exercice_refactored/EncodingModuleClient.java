package com.directi.training.dip.exercise_refactored;

import java.net.URL;

public class EncodingModuleClient
{
    public static void main(String[] args) throws Exception
    {
      
        IReader fileReader = new CustomFileReader("beforeEncryption.txt");
        IWriter fileWriter = new CustomFileWriter("afterEncryption.txt");
        EncodingModule fileEncodingModule = new EncodingModule(fileReader, fileWriter);
        fileEncodingModule.encode();
  
        IReader networkReader = new NetworkReader(new URL("http", "myfirstappwith.appspot.com", "/index.html"));
        IWriter dbWriter = new DatabaseWriter(new MyDatabase());
        EncodingModule networkEncodingModule = new EncodingModule(networkReader, dbWriter);
        networkEncodingModule.encode();
    }
}
