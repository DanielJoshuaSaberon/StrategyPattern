package StrategyPattern.ConcreteStrategy;

import StrategyPattern.StrategyInteface.Strategy;

public class Wizard implements Strategy {
    @Override
    public String attack() {
        return "Wizard casts a spell!";
    }

    @Override
    public String defend() {
        return "Creating a magic barrier for defense!";
    }
}
