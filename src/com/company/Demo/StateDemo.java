package com.company.Demo;

import com.company.State.*;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class StateDemo implements Demo {
    @Override
    public void execute() {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
