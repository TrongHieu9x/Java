package org.bai2.baitap;

public class Exceise {
    public static void main(String[] args) {
        // viết chương trình tính tổng các
        // số nguyên tố nhỏ hơn 500

        // SNT là số chỉ chia hết cho 1 và chính nó
        // 2 phương án:
        // PA1: chia số N cho các số từ 1 => N, đếm ước
        // nếu số ước = 2 => N là SNT
        // PA2: chia số N cho các số từ 2 => N - 1
        // nếu trong quá trình chia, có chia hết => N không phải SNT

        int N = 1;
        int sum = 0;
        int[] primeNumbers = new int[500]; // Tạo mảng để lưu trữ các số nguyên tố
        int index = 0; // Biến chỉ mục cho mảng primeNumbers

        while (N < 500) { //Vòng lặp while kiểm tra điều kiện N < 500. Vòng lặp sẽ dừng khi N đạt giá trị 500.
            if (N < 2) {
                N++;
                continue; // nếu N nhỏ hơn 2, nó được tăng lên 1 và vòng lặp tiếp tục với giá trị N tiếp theo (bằng cách sử dụng lệnh continue). Điều này đảm bảo rằng chúng ta không xét số 0 và 1.
            } else {
                boolean flag = true;
                for (int i = 2; i < N; i++){ //Nếu N chia hết cho bất kỳ số nào trong khoảng này, thì N không phải là số nguyên tố và biến flag sẽ được gán giá trị false.
                    if (N % i == 0){         // Nếu không, N là số nguyên tố và flag sẽ được giữ là true.
                        flag = false;
                        break;
                    }
                }
                if (flag) {        //Nếu flag vẫn là true sau vòng lặp kiểm tra số nguyên tố, tức là N là một số nguyên tố, nó sẽ được thêm vào biến sum.
                    sum += N;
                    primeNumbers[index++] = N; // Thêm số nguyên tố vào mảng
                }
            }
            N++;
        }
//        System.out.println(sum);
        System.out.println("Tổng của các số nguyên tố là: " + sum);
        System.out.println("--------------");
        System.out.println("Các số nguyên tố trong khoảng từ 2 đến 499 là:");

        for (int i = 0; i < index; i++) {
            System.out.print(primeNumbers[i] + " "); // In từng số nguyên tố trong mảng
        }
    }
}
