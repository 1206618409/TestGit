package com.oop.extend.ccc;

public class Bus extends MotoVegucle {
    private int account;

    public Bus(int no, String brand,int account) {
        super(no, brand);
        this.account = account;
    }
    public Bus(){}

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    @Override
    public int CalcRemt(int day) {
        if (account>16){
            return 1500*day;
        }else{
            return 800*day;
        }

    }
}
