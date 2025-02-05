package StrategyPattern.ConcreteStrategy;

import StrategyPattern.StrategyInteface.Strategy;

public class Knight implements Strategy {
    @Override
    public String attack() {
        return "Knight attacks with a sword!";
    }

    @Override
    public String defend() {
        return "Using a shield to defend, Dodgin to avoid attack!, Creating a magic barrier for defense!";
    }
}
