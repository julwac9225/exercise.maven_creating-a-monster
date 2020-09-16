package com.github.perscholas;

//The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread.
// The class must define a method of no arguments called run.
//This interface is designed to provide a common protocol for objects that wish to execute code while they are active.
public class ApplicationRunner implements Runnable {
    public void run() {
        animateMonster((Monster)new FireMonster());
        animateMonster((Monster)new WaterMonster());
        animateMonster((Monster)new StoneMonster());
    }

    private void animateMonster(Monster monster) {
        // Java built in functions/methods to call on object 'monster'
        // .getClass() - returns the runtime class of this Object.
        // The returned Class object is the object that is locked by static synchronized methods of the represented class.
        // .getSimpleName() returns the simple name of the underlying class as given in the source code.
        // initialize String object, assign value or literal
        String monsterType = monster.getClass().getSimpleName();
        System.out.println(monsterType + " has been created!");
        // call method attack for 'monster' object of Monster class
        String attackOutput = monster.attack();
        System.out.println("A " + monsterType + " has attacked.");
        System.out.println("The attack performed was " + attackOutput);
    }
}
