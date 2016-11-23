package com.company.Builder;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class OfficeBuildingBuilder extends Builder {
    private OfficeBuilding ob = new OfficeBuilding();
    private int floors = 0;

    public void buildFundament() {
        ob.setPart("Фундамент. ");
    }

    public void buildBasement() {
        ob.setPart("Подвал. ");
    }

    public void buildFloor() {
        floors++;
        ob.setPart(floors + " этаж. ");
    }

    public void buildRoof() {
        ob.setPart("Плоская крыша. ");
    }

    @Override
    public OfficeBuilding getBuilding() {
        return ob;
    }
}