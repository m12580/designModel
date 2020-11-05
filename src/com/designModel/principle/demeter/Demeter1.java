package com.designModel.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class Demeter1 {

    public static void main(String[] args) {
        AllManager allManager = new AllManager();
        allManager.printManager(new DepartManager());
    }

}

class AllMember{
    int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}

class DepartMember{
    int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}

class AllManager{
    public List<AllMember> setAllMember(){
        List<AllMember> list= new ArrayList<>();
        for (int i = 0 ; i < 5 ; i++){
            AllMember member = new AllMember();
            member.setId(i);
            list.add(member);
        }
        return list;
    }

    public void printManager(DepartManager dm){
        List<AllMember> allMembers = setAllMember();
        System.out.println("输出全部成员信息****************************");
        for (AllMember allMember : allMembers){
            System.out.println("总部成员ID：" + allMember.getId());
        }
        System.out.println("输出分部成员信息****************************");
        List<DepartMember> departMembers = dm.setDepartMember();
        for(DepartMember departMember : departMembers){
            System.out.println("分部成员ID：" + departMember.getId());
        }
    }

}

class DepartManager{
    public List<DepartMember> setDepartMember(){
        List<DepartMember> list= new ArrayList<>();
        for (int i = 0 ; i < 5 ; i++){
            DepartMember member = new DepartMember();
            member.setId(i);
            list.add(member);
        }
        return list;
    }
}