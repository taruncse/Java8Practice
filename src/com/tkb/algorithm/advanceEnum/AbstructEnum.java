package com.tkb.algorithm.advanceEnum;

public enum  AbstructEnum {
    WINTER{
        @Override
        public void showValue() {
            System.out.println(WINTER);
        }
    }, SUMMER{
        public void showValue() {
            System.out.println(SUMMER);
        }
    };
    public abstract void showValue();
}
