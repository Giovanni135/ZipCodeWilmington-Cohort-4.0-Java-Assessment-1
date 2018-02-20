package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int minJumps = k/j; //distance per jump
        int movePerJump = k%j; // remainder to jump, since Bob can't overshoot his jumps. 3/2, etc.
        return (minJumps + movePerJump);
    }
}
