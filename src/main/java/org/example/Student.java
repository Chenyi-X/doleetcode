package org.example;

public class Student {
    private int number;
    private String name;
    private int  age;

    public Student (int number, String name, int age) {
        this.age = age;
        this.number = number;
        this.name = name;
    }

    public void addAge(int n) {
        this.age += n;
    }

    public void printInfo() {
        System.out.println("学生信息如下：");
        System.out.println("学号：" + this.number);
        System.out.println("姓名：" + this.name);
        System.out.println("年龄：" + this.age);
        System.out.println();
    }

    public int getAge() {
        return age;
    }
}
