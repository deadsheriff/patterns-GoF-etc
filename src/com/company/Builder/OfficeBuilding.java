package com.company.Builder;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class OfficeBuilding {
    private StringBuilder parts = new StringBuilder();

    public void setPart(String part) {
        parts.append(part);
    }

    public String getParts() {
        return parts.toString();
    }
}