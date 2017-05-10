package com.company.Interfaces.animals;

import com.company.Interfaces.interfaces.Audible;
import com.company.Interfaces.interfaces.Moveable;

/**
 * Created by RENT on 2017-05-10.
 */
public class Cat implements Moveable, Audible {
    @Override
    public void run() {
        System.out.println("Cat: I'm running!");
    }

    @Override
    public void hide() {
        System.out.println("Cat: I'm hiding!");

    }

    @Override
    public void makeNoise() {

    }
}
