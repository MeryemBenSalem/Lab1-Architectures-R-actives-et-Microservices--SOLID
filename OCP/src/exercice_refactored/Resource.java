package com.directi.training.ocp.exercise;

public interface Resource {
    void markSlotFree(int resourceId);
    void markSlotBusy(int resourceId);
    int findFreeSlot();
}
