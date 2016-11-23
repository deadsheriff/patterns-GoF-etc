package com.company.Prototype;

/**
 * Created by Пользователь on 22.11.2016.
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
