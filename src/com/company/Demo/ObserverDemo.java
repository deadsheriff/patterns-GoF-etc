package com.company.Demo;

import com.company.Observer.*;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class ObserverDemo implements Demo {
    @Override
    public void execute() {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
