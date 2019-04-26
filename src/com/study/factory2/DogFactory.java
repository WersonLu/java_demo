package com.study.factory2;

import com.study.factory.Animal;
//import com.study.factory.AnimalFactory;
import com.study.factory.Dog;

public class DogFactory implements Factory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
