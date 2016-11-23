package com.company.Demo;
import com.company.Builder.*;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class BuilderDemo implements Demo {

    @Override
    public void execute() {
        FrameHouse fh = Director.getFrameHouse();
        System.out.println(fh.getParts());

        OfficeBuilding ob = Director.getOfficeBuilding();
        System.out.println(ob.getParts());
    }
}
