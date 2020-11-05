package com.designModel.principle.substitution;

public class substitution1 {

    public static void main(String[] args) {
        //先计算两个数的差，再计算两个数的和加10
        B b = new B();
        System.out.println("5-2="+b.func1(5,2));
        System.out.println("5+2+10="+b.func2(5,2));
    }

}

class A{
    public int func1(int a,int b){
        return a-b;
    }
}

class B{
    public int func1(int a, int b){
        return a+b;
    }
    public int func2(int a, int b){
        return func1(a,b)+10;
    }
}
