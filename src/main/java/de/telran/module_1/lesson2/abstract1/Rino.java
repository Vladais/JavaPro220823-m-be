package de.telran.module_1.lesson2.abstract1;

public class Rino extends Animal{
    int sizeRog;

    @Override
    protected void voice() {
        System.out.println("Орёт");
    }

    @Override
    protected void run() {
        System.out.println("Топает ногами");
    }
}

