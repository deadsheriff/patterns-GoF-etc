package com.company.Demo;

import com.company.Template.*;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class TemplateDemo implements Demo {
    @Override
    public void execute() {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
