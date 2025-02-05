package StrategyPattern;

import StrategyPattern.ConcreteStrategy.*;
import StrategyPattern.Context.Character;

public class Client {
    public static void main(String[]args){
        Character character1 = new Character("Knight", new Knight());
        System.out.println(character1.AttackDefend());

        System.out.println();
        Character character2 = new Character("Wizard", new Wizard());
        System.out.println(character2.AttackDefend());

        System.out.println();
        Character character3 = new Character("Archer", new Archer());
        System.out.println(character3.AttackDefend());


    }
}
