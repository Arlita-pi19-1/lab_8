package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a=10;
        People people=new People();
        people.printInfo();
    }
}
class People extends Main{
    protected String name;
    protected String lasname;
    protected int age;

    People(){
        this.name="Аэлита";
        this.lasname="Иванова";
        this.age=19;
    }
    People(String nameAdd, String lasnameAdd, int ageAdd){
        this.name=nameAdd;
        this.lasname=lasnameAdd;
        this.age=ageAdd;

    }
    public void printInfo(){
        System.out.println(this.name + " " + this.lasname + " " + this.age+ " ");

    }
    public void run(){
        System.out.println("Run");

    }
    public void walk(){
        System.out.println("Walk");
    }
    public void voice(){
        System.out.println("Voice");
    }

}
class Student extends People {
    public void learn() {
        System.out.println("Learn");

    }
}
class Teacher extends People{
    public void teach(){
        System.out.println("Teach");
    }

}





