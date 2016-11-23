package com.company.AbstractFactory;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class ElfSquadFactory extends SquadFactory {
    @Override
    public Mage createMage() {
        return new ElfMage();
    }

    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}

