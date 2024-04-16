package org.bai4.oop;

    //trong 1 file .java chỉ chứa 1 class public duy nhất, trùng tên vs file

public class Animal {
    // đây là 1 lớp trong lập trình OOP
    // trong lớp thường sẽ chứa 2 phần cơ bản
    // property: thuộc tính của lớp, thể hiện cho đặc tính, tính chất của lớp đó
    // method: phương thức của lớp, thể hiện cho hành vi, khả năng của lớp đó
    private double weight; //Chỉ dùng trong lớp này
    double height;          //Dùng trong lớp package
    protected String gender;    //Dùng trong lớp, trong package, ngoài package
    public int age;         //Dùng trong toàn project

    //Hàm khởi tạo
    public Animal(double weight, double height, String gender, int age) {
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.age = age;
    }

    public Animal(double weight, double height) {
        super();
        this.weight = weight;
        this.height = height;
    }

    public Animal() {}

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void display() {
        System.out.println("Hello");
    }
}
