/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_4_Array_ArrayList_List;

import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class B2_MangHaiChieu {
   /*
        Mảng 2 chiều - Mảng đa chiều ()
        
    - Công thức: <kiểu dữ liệu>[][] arr + <tên> = new <kiểu dữ liệu>[row][col];
        - [row]: Số lượng dòng kiểu số nguyên
        - [col]: Số lượng cột kiểu số nguyên
     */
  public static void main(String[] args) {
    //1. Khai báo
        int[][] arrNumber = new int[2][3];//Khởi tạo 1 mảng 2 chiều có 2 dòng 3 cột

        //2. Gán giá trị:
        //Gán dòng số 1
        arrNumber[0][0] = 5;
        arrNumber[0][1] = 8;
        arrNumber[0][2] = 9;

        arrNumber[1][0] = 9;//Gán tại dòng số 2

        //3. Lấy giá trị
        System.out.println(arrNumber[0][1]);
        //Dùng vòng lặp để lấy giá trị
        for (int i = 0; i < 2; i++) {
            //i index của dòng
            for (int j = 0; j < 3; j++) {
                //j index của cột
                System.out.printf("index row: %d | index col: %d ", i, j);
                System.out.println(arrNumber[i][j]);
                //System.out.print(arrNumber[i][j] + " ");
            }
            //System.out.println();
        }

        //Ví dụ mẫu: Cho người dùng tạo mảng 2 chiều theo ý người dùng
        Scanner sc = new Scanner(System.in);
        int[][] arrNumberInput;
        int row, col;
        System.out.println("Chương trình mảng 2 chiều");
        System.out.print("Mời bạn nhập số lượng row? : ");
        row = sc.nextInt();
        System.out.print("Mời bạn nhập số lượng col? : ");
        col = sc.nextInt();

        //Khởi tạo mảng theo giá trị người dùng nhập vào
        arrNumberInput = new int[row][col];

        //Nhập dữ liệu vào mảng 2 chiều
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Mời bạn nhập giá trị tại row: %d | col: %d = ", i, j);
                arrNumberInput[i][j] = sc.nextInt();
            }
        }
        //Xuất dữ liệu
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("\n Giá trị tại row: %d | col: %d = %d",
                         i, j, arrNumberInput[i][j]);
            }
        }
  }
}
