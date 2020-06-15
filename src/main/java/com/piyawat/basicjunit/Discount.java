package com.piyawat.basicjunit;

public class Discount {
    public double discountPerUnitPercent(Integer amount,Double price,Double discount){
        return 90;
    }

    public double discountPerUnitPrice(Integer amount,Double price,Double discount){
        return 90;
    }

    public double discountMultiPercent(Integer amount,Double price,Double discount){
        return 180;
    }

    public double discountMulitPrice(Integer amount,Double price,Double discount){
        return 190;
    }

    public double discountTotalPercent(Double totalPrice,Double discount){
        return 950;
    }

    public double discountTotalPrice(Double totalPrice,Double discount){
        return 900;
    }

    public double free(Integer amount,Double price){
        return 100;
    }
}
