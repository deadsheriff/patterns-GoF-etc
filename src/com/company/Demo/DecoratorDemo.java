package com.company.Demo;
import com.company.Decorator.*;
/**
 * Created by Пользователь on 23.11.2016.
 */
public class DecoratorDemo implements Demo {
    @Override
    public void execute() {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
