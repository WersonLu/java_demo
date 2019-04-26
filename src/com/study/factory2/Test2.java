package com.study.factory2;

import com.study.factory.Cat;
import com.study.factory.Dog;

public class Test2 {
    public static void main(String[] args) {
        Cat cat = (Cat) new CatFactory().createAnimal();
        cat.eat();

    }
}
