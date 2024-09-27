package com.oop.extend.ccc;

public abstract class MotoVegucle {
    private int no;
    private String brand;
    public abstract int CalcRemt(int day);
    public MotoVegucle(int no,String brand){

    }
    public MotoVegucle(){

    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
