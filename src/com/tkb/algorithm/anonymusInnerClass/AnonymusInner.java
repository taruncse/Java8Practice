package com.tkb.algorithm.anonymusInnerClass;

public class AnonymusInner {
    interface Payment{
        int calculation();
    }

    public int pay(){
        return totalMoney(50, new Payment() {
            @Override
            public int calculation() {
                return 25;
            }
        });
    }

    public int totalMoney(int money, Payment calculation){
        return money - calculation.calculation();
    }
}
