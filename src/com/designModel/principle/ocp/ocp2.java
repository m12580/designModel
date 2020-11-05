package com.designModel.principle.ocp;

public class ocp2 {

    public static void main(String[] args) {
        food2 m = new MeatActivity();
        m.getPrice();
    }

}

interface food2{
    void getPrice();
}

class Meat2 implements food2{
    String price;

    @Override
    public void getPrice() {
        System.out.println("猪肉价格：24.00");
    }
}

class MeatActivity extends Meat2{
    @Override
    public void getPrice() {
        System.out.println("猪肉价格：20.00");
    }
}