package com.company.Builder;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class FrameHouseBuilder extends Builder {
    private FrameHouse fh = new FrameHouse();

    public void buildFundament() {
        fh.setPart("Фундамент. ");
    }

    public void buildFloor() {
        fh.setPart("1 этаж. ");
    }

    public void buildRoof() {
        fh.setPart("Двускатная крыша. ");
    }

    @Override
    public FrameHouse getBuilding() {
        return fh;
    }
}
