package com.company.Interfaces;


public class Main {


    public void main(String[] args) {


        Zoo zoo = new Zoo();
        zoo.init();
        zoo.runAnimalsByObjectRef();
        zoo.runAnimalsByInterfaceRef();
        zoo.hideAnimalsByInterfaceRef();
    }
}
