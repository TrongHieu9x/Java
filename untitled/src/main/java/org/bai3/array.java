package org.bai3;

public class array {
    public static void main(String[] args) {
        // 2 cách khai báo mảng
        // khai báo trực tiếp bằng ngoặc nhọn
        int[] ints = {}; //Khai báo mảng rỗng
        int[] ints1 = {5, 4, 3, 2, 1};
        // 5,6,7 là các phần tử trong mảng
        // vị trí tương ứng: 5 là 0;
        //                   4 là 1;
        //                   3 là 2;
        //                   2 là 3;
        //                   1 là 4
        // vị trí này giúp truy xuất giá trị tương ứng hoặc là gán giá trị mới
        // độ dài mảng (length) = 4
        //--------------------------------

        // truy xuất phần tử ở vị trí 2
        System.out.println(ints1[2]);
        System.out.println(ints1.length);

//        for (int i = 0; i < ints1.length; i++) {
//            System.out.println("Vị trí: " + i + "; Giá trị: " + ints[i]);
//        }

        // for each: truy xuất nhanh giá trị của mảng
        for (int value : ints1) {
            System.out.println(value);
        }
        System.out.println("-------------");
        // thêm giá trị 100 vào vị trí số 2
        int[] array = new int[ints1.length + 1];
        for (int i = 0; i < ints1.length; i++){
            if (i < 2) {
                array[i] = ints1[i];
            } else {
                array[i + 1] = ints1[i];
            }
        }
        array[2] = 100;

        for (int value : array) {
            System.out.println(value);
        }
        System.out.println("-----------------");

        // khai báo bằng từ khóa new
        int[] ints2 = new int[5];
        System.out.println(ints1.length);
        System.out.println(ints2[2]);
        System.out.println(ints2[1]);
    }
}
