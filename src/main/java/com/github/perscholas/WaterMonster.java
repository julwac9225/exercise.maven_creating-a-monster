package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
// The body of the interface method is provided by the "implement" class.

public class WaterMonster implements Monster {
    @Override
    public String attack(){
        System.out.println("Water Ball");
        return "Water Ball";
    }
}
