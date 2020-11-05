package com.designModel.principle.inversion;

public class Inversion2 {

    public static void main(String[] args) {
        Person2 p = new Person2();
        p.getMessage(new Email2());
        p.getMessage(new Phone());
    }

}

class Person2{

    public void getMessage(Message message){
        System.out.println("用户" + message.getMessages());
    }

}

interface Message{
    String getMessages();
}

class Email2 implements Message{
    public String getMessages(){
        return "收到email信息";
    }
}

class Phone implements Message{
    public String getMessages(){
        return "收到电话信息";
    }
}
