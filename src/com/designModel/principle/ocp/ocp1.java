package com.designModel.principle.ocp;

public class ocp1 {

    public static void main(String[] args) {
        Meat m = new Meat();
        m.getPrice();
    }

}

interface food{
    void getPrice();
}

class Meat implements food{
    String price;

    @Override
    public void getPrice() {
        System.out.println("猪肉价格：24.00");
    }
}