package com.company.Interfaces;

import com.company.Interfaces.interfaces.Audible;
import com.company.Interfaces.interfaces.Moveable;
import com.company.Interfaces.animals.Badger;
import com.company.Interfaces.animals.Cat;
import com.company.Interfaces.animals.Dog;

import java.util.ArrayList;

public class Zoo {
    ArrayList<Dog> dogs = new ArrayList<>();
    ArrayList<Cat> cats = new ArrayList<>();
    ArrayList<Badger> badgers = new ArrayList<>();
    ArrayList<Moveable> moveables = new ArrayList<>();
    ArrayList<Audible> audibles = new ArrayList<>();

    public void init() {


        Dog dog = new Dog();
        dogs.add(dog);

        Cat cat = new Cat();
        cats.add(cat);

        Badger badger = new Badger();
        badgers.add(badger);

        moveables.add(dog);
        moveables.add(cat);
        moveables.add(badger);

        audibles.add(dog);
        audibles.add(cat);
        audibles.add(badger);
    }

    public void runAnimalsByObjectRef() {

        for (Dog dog : dogs) {
            dog.run();
        }
        for (Cat cat : cats) {
            cat.run();
        }
        for (Badger badger : badgers) {
            badger.run();
        }
    }

    public void runAnimalsByInterfaceRef() {
        for (Moveable moveable : moveables) {
            moveable.run();
        }
    }

    public void hideAnimalsByInterfaceRef() {
        for (Moveable moveable : moveables) {
            moveable.hide();
        }
    }

    public void makeNoiseAnimalsByInterfaceRef() {
        for (Audible audible : audibles) {
            audible.makeNoise();
        }
    }
}