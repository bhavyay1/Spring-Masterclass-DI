package com.bhavya.springtasks.beans;

public class Person {

    private int id;
    private String name;

//    public Person(int id, String name){
//        this.id = id;
//        this.name = name;
//    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    //public void passMyMsg(String str){
      //  System.out.println("Hello "+ str);
   // }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void display(){
        System.out.println(id + "---"+name);
    }
}
