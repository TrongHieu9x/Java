package org.bai4.test;

import org.bai4.oop.Animal;

public class main {
    public static void main(String[] args) {
        Animal animal = new Animal(10, 5, "male", 2);
        System.out.println(animal.age);

        System.out.println("--------------");

        Cat cat = new Cat();
        cat.getGender();
        cat.display("abc");

        Animal animal1 = new Animal();
        Cat cat1 = new Cat();
        animal1.display();
        cat1.display();

        // công cụ sửa đổi truy cập kiểu dữ liệu không truy cập phương thức tên trả về (tham số)
        // nếu có data_type_return bắt buộc có từ khóa return
    }
}
