package com.company.Demo;

import com.company.Facade.*;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class FacadeDemo implements Demo {
    @Override
    public void execute() {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
