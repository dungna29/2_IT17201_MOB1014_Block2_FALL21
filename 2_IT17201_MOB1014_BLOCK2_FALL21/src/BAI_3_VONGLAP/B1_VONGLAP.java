/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_3_VONGLAP;

import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class B1_VONGLAP {

  /*
         * BàiVòng lặp:
         *
         * Định nghĩa chung cho tất cả vòng lặp:
         * Vòng lặp cho phép lặp lại một hoặc nhiều câu lệnh cho đến khi thỏa mãn điều kiện được chỉ định định.
         *
         * Các loại vòng lặp: while, do..while, for, foreach
         *
         * Từ khóa sử dụng trong vòng lặp:
         *
         * break - ngắt vòng lặp
         * continue: Sẽ bỏ qua các đoạn code phía sau nó và nó quay trở lại lần lặp tiếp theo.
         *
         * Vòng lặp while: Chỉ chạy khi điều kiện luôn đúng và nếu điều kiện luôn đúng ko điểm dừng thì được gọi là vòng lặp vô hạn.
         * + Cách dùng: wh + tab
         *
         * + Công thức:
         *  while (true)
            {
                //Thực thi 1 câu lệnh hoặc nhiều câu lệnh
            }
  
            Vòng lặp Do..While: Thực hiện hành động ít nhất là 1 lần. Điều kiện đề vòng lặp chạy giống như While(True).
           Cách gõ: do + tab
           Công thức: 
           do {
                      //Thực hiện hành động ít nhất là 1 lần.
           } while (true);
  
            Cách gõ: for + tab
            Công thức:
             for (int i = 0; i < 10; i++) {
                }
            int i = 0: Điểm bắt đầu của vòng lặp có kiểu số nguyên
            i < 10: Điều kiện để ngắt vòng
            i++: Tăng bước nhẩy lên 1
   */
  public static void main(String[] args) {
    /*
        1. Điểm bắt đầu
        2. Điều kiện để chạy
        3. Bước nhẩy
     */
    //1. Vòng lặp for: for + tab
    for (int i = 0; i < 3; i++) {
      System.out.println("Chào các bạn");
    }

    //2. Vòng lặp While: wh + tab
//    int i = 0;
//    while (i < 3) {
//      System.out.println("Chào các bạn");
//      i++;
//    }
    //3. Vòng lặp Do While: do + tab
    int i = 0;
    do {
      System.out.println("Chào các bạn");
      i++;
    } while (i < 3);

    /*
      Bài 1: Cho người dùng nhập vào 1 bảng cửu chương sau đó in ra. (2 cách for và While).
      Bài 2: In bảng cửu chương theo khoảng người dùng nhập vào.
     */
    Scanner sc = new Scanner(System.in);
    while (true) {
      int khoang1, khoang2;
      System.out.print("Mời bạn nhập vào khoảng 1: ");
      khoang1 = Integer.parseInt(sc.nextLine());
      System.out.print("Mời bạn nhập vào khoảng 2: ");
      khoang2 = Integer.parseInt(sc.nextLine());
      for (int j = Integer.min(khoang1, khoang2); j <= Integer.max(khoang1, khoang2); j++) {
        for (int k = 1; k <= 9; k++) {
          System.out.printf("%d x %d = %d \n", j, k, j * k);
        }
      }
    }
  }
}
