package com.directi.training.isp.exercise;

import java.util.Random;

public class Sensor
{
    public void register(ISensingDoor door)
    {
        if (isPersonClose()) {
            door.proximityCallback();
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}

