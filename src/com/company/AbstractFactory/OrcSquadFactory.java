package com.company.AbstractFactory;

/**
 * Created by Пользователь on 23.11.2016.
 */
public class OrcSquadFactory extends SquadFactory {
    @Override
    public Mage createMage() {
        return new OrcMage();
    }

    @Override
    public Archer createArcher() {
        return new OrcArcher();
    }

    @Override
    public Warrior createWarrior() {
        return new OrcWarrior();
    }
}
