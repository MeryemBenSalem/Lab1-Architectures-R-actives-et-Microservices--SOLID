package com.directi.training.dip.exercise_refactored;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkReader implements IReader
{
    private URL _url;

    public NetworkReader(URL url)
    {
        _url = url;
    }

    @Override
    public String read()
    {
        StringBuilder content = new StringBuilder();
        try (InputStream in = _url.openStream();
             InputStreamReader reader = new InputStreamReader(in)) {
            int c;
            while ((c = reader.read()) != -1) {
                content.append((char) c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
