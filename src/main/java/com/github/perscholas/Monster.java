package com.github.perscholas;

/**
 * Created by leon on 6/10/2020.
 */
//An interface is a completely "abstract class" that is used to group related methods with empty bodies.
//To access the interface methods, the interface must be "implemented" by another class with the implements keyword.

public interface Monster {
    //method to be implemented by monsters returns String object
    String attack();
}
