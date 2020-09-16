package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
// The body of the interface method is provided by the "implement" class.

public class StoneMonster implements Monster {
    @Override
    public String attack(){
        System.out.println("Rock");
        return "Rock";
    }
}
