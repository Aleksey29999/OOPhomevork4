package ru.geekbrains;

import java.util.ArrayList;
import java.util.Random;

class Box<T extends Fruit> {
    ArrayList<T> fruits;
    //    private String type;
//    private double countFruit;
    protected double allWeight;
    private static Random random = new Random();
    public int countFruit = random.nextInt(1, 30);
    public Box() {
        this.fruits = new ArrayList<>();;
//        this.type = type;
//        this.countFruit = countFruit;
        this.allWeight = allWeight;
    }

    public void addFruit(T Fruit) {
        fruits.add(Fruit);
        allWeight = countFruit * Fruit.getWeight();
    }
//        public double getallWeight() {
//            return allWeight;
//        }

    @Override
    public String toString() {
        return "Box{" +
                "вес одного фрукта=" + fruits +
                ", количество фруктов в коробке=" + countFruit +
                ", общий вес коробки=" + allWeight +
                '}';
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public double getAllWeight() {
        return allWeight;
    }

    public int getCountFruit() {
        return countFruit;
    }

    public void setFruits(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public void setAllWeight(double allWeight) {
        this.allWeight = allWeight;
    }
//    public double setAllWeight() {
//       return this.allWeight = allWeight;
//    }

    public void setCountFruit(int countFruit) {
        this.countFruit = countFruit;
    }

//    public int compare(Box o1, Box o2) {
//        return o1.getWeight().compareTo(o2.getWeight());
//    }
//
//    <T> Comparable<T> getWeight() {
//        return getWeight();
//    }
}

