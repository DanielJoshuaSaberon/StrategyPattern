package StrategyPattern.ConcreteStrategy;

import StrategyPattern.StrategyInteface.Strategy;

public class Archer implements Strategy {
    @Override
    public String attack() {
        return "Archer shoots an arrow!";
    }

    @Override
    public String defend() {
        return "Using a shield to defend!";
    }
}
