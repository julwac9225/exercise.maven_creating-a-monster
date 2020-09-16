package com.github.perscholas;

// The body of the interface method is provided by the "implement" class.
public class FireMonster implements Monster{
    @Override
    public String attack(){
        System.out.println("Fire Ball");
        return "Fire Ball";
    }
}
