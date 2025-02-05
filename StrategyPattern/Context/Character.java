package StrategyPattern.Context;

import StrategyPattern.StrategyInteface.Strategy;

public class Character {
    private String characterName;
    private Strategy characterStrategy;

    public Character(String characterName, Strategy characterStrategy) {
        this.characterName = characterName;
        this.characterStrategy = characterStrategy;
    }

    public String AttackDefend (){
        return "Your character is " + characterName +
        "\nATTACK Strat: " + characterStrategy.attack() + "\nDEFENSE Strat: "+ characterStrategy.defend();
    }
}
