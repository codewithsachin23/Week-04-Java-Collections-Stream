package org.day06.problemstatement.annotation.excercise.usedoverride;

//Child class Dog
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
