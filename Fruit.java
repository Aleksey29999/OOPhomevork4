package ru.geekbrains;

abstract class Fruit{

    protected final float weight;

    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%.2f вес.", weight);
    }

}
