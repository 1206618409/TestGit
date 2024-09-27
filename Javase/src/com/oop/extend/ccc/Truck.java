package com.oop.extend.ccc;

public class Truck extends MotoVegucle {
    private int weight;
    @Override
    public int CalcRemt(int day) {
        return 50*day*weight;
    }

    public Truck(int no, String brand, int weight) {
        super(no, brand);
        this.weight = weight;
    }

    public Truck(){

    }

}
