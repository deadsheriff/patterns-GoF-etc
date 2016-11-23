package com.company.Builder;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class Director {
    public static FrameHouse getFrameHouse() {
        FrameHouseBuilder fhb = new FrameHouseBuilder();
        fhb.buildFundament();
        fhb.buildFloor();
        fhb.buildRoof();
        return fhb.getBuilding();
    }

    public static OfficeBuilding getOfficeBuilding() {
        OfficeBuildingBuilder fhb = new OfficeBuildingBuilder();
        fhb.buildBasement();
        fhb.buildFundament();
        for (int i=0; i < 5; i++) {
            fhb.buildFloor();
        }
        fhb.buildRoof();
        return fhb.getBuilding();
    }
}
