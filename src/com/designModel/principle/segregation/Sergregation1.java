package com.designModel.principle.segregation;

public class Sergregation1 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.method1();
        a.method2();
        a.method3();
        b.method1();
        b.method4();
        b.method5();
    }
}
interface  interface1{
    void method1();
    void method2();
    void method3();
    void method4();
    void method5();
}

class A implements interface1{

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

    @Override
    public void method4() {
        System.out.println("A执行方法4");
    }

    @Override
    public void method5() {
        System.out.println("A执行方法5");
    }
}

class B implements interface1{

    @Override
    public void method1() {
        System.out.println("B执行方法1");
    }

    @Override
    public void method2() {
        System.out.println("B执行方法2");
    }

    @Override
    public void method3() {
        System.out.println("B执行方法3");
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

