package com.oop.extend.ccc;

public class Car extends MotoVegucle {
        private  String type;

    public Car(int no, String brand) {
        super(no, brand);
    }

    public Car(int no, String brand, String type){
        super(no,brand);
        this.type = type;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(){}
    @Override
    public int CalcRemt(int day) {

        if (type.equals("0")){
            return 600*day;
        }else if (type.equals("1")){
            return 500*day;
        }else if (type.equals("2")){
            return 300*day;
        }else {
            System.out.println("类型不匹配");
            return 0;
        }
    }
}
