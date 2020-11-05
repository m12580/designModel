package com.designModel.principle.segregation;

public class Sergregation2 {

    public static void main(String[] args) {
        A1 a = new A1();
        B1 b = new B1();
        a.method1();
        a.method2();
        a.method3();
        b.method1();
        b.method4();
        b.method5();
    }
}

interface  interface2{
    void method1();
}

interface  interface3{
    void method2();
    void method3();
}

interface  interface4{
    void method4();
    void method5();
}

class A1 implements interface2,interface3{

    @Override
    public void method1() {
        System.out.println("A执行方法1");
    }

    @Override
    public void method2() {
        System.out.println("A执行方法2");
    }

    @Override
    public void method3() {
        System.out.println("A执行方法3");
    }
}

class B1 implements interface2,interface4{

    @Override
    public void method1() {
        System.out.println("B执行方法1");
    }

    @Override
    public void method4() {
        System.out.println("B执行方法4");
    }

    @Override
    public void method5() {
        System.out.println("B执行方法5");
    }
}

