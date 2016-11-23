package com.company.Demo;

import com.company.Mediator.*;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class MediatorDemo implements Demo {
    @Override
    public void execute() {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
