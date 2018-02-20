package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
        //this.name = name;
        //this.age = age;
        // I don't understand how else to get this problem, and the above does not compile.
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {

    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {

    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        String speak = "Meow";
        return speak;
    }
}
