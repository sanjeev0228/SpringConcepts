package org.example;

public class Allien {

    private   int age;
    private  Laptop lap ;



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setter called");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public Allien(){
        System.out.println("object created");

    }

    public Allien(int age) {
        this.age = age;
        System.out.println("Para contructor called");
    }

    public void code() {
        System.out.println("Allien");
    }
}
