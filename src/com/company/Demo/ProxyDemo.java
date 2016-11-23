package com.company.Demo;

import com.company.Proxy.*;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class ProxyDemo implements Demo {
    @Override
    public void execute() {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
