package ru.geekbrains;

class Apple extends Fruit {

    public Apple() {
        super(1.0f);
    }

    @Override
    public String toString() {
        return String.format("%.2f вес.", weight);
    }

}