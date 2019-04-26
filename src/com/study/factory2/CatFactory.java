package com.study.factory2;

import com.study.factory.Animal;
import com.study.factory.Cat;

public class CatFactory implements Factory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
