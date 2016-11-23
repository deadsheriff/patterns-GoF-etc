package com.company.Visitor;

/**
 * Created by Пользователь on 22.11.2016.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
