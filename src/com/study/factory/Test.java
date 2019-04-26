package com.study.factory;

public class Test {
    public static void main(String[] args) {

//        Dog d = AnimalFactory.createDog();
//        d.eat();  //狗吃骨头
        Dog d = (Dog) AnimalFactory.createAnimal("dog");
        d.eat();
        Cat c = (Cat) AnimalFactory.createAnimal("cat");
        c.eat();
    }
}
