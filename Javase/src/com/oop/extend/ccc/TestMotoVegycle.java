package com.oop.extend.ccc;

public class TestMotoVegycle {
    public static void main(String[] args) {
//        Car c = new Car(1,"宝马","1");
//        System.out.println("租金是："+c.CalcRemt(5));
//        Bus b = new Bus(2,"金龙",20);
//        System.out.println("租金是："+b.CalcRemt(5));
        MotoVegucle[] moto = new MotoVegucle[5];
        moto[0] = new Car(1,"宝马","1");
        moto[1] = new Car(1,"宝马","1");
        moto[2] = new Car(2,"别克","2");
        moto[3] = new Bus(3,"金龙",34);
        moto[4] = new Truck(4,"红旗",50);
        int money = calcRemt(moto);

        System.out.println("总租金是："+money);

    }
    public static int calcRemt(MotoVegucle[] moto){
        int money = 0;
        for (int i = 0; i <moto.length ; i++) {
            money += moto[i].CalcRemt(5);
        }
        return money;
    }
}
