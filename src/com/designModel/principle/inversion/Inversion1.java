package com.designModel.principle.inversion;

public class Inversion1 {

    public static void main(String[] args) {
        Person p = new Person();
        p.getMessage(new Email());
    }

}

class Person{

    public void getMessage(Email email){
        System.out.println("用户" + email.getMessages());
    }

}

class Email{
    public String getMessages(){
        return "收到email信息";
    }
}
