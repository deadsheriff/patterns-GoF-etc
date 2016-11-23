package com.company.Demo;

import com.company.Visitor.*;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class VisitorDemo implements Demo {
    @Override
    public void execute() {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
