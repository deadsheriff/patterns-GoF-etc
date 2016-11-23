package com.company.Visitor;

/**
 * Created by Пользователь on 22.11.2016.
 */
public class Monitor implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
