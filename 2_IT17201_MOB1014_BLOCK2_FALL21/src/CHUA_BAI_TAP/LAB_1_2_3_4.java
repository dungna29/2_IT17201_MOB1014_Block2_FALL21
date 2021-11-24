/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CHUA_BAI_TAP;

import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class LAB_1_2_3_4 {

  public static void main(String[] args) {
    /*
    Bài 6: Viết 1 chương trình cho phép người dùng nhập vào bao nhiêu số tùy thích. Sau khi nhập xong in ra màn hình các số chẵn trên 1 dòng và số lẻ trên 1 dòng.
10 */
    Scanner sc = new Scanner(System.in);
    int[] arrNumber;//Khai báo mảng
    String input;
    System.out.println("Mời bạn nhập số lượng: ");
    input = sc.nextLine();
    //Sau khi hứng được số lượng thì phải khởi tạo mảng
    arrNumber = new int[Integer.parseInt(input)];
    for (int i = 0; i < arrNumber.length; i++) {
      System.out.printf("Mời bạn nhập index [%d] \n", i);
      arrNumber[i] = Integer.parseInt(sc.nextLine());
    }
    int temp = 0;    
    System.out.println(" size : " + arrNumber.length);
    for (int i = 0; i < arrNumber.length * 2; i++) {//6      
      if (i < arrNumber.length) {
        if (arrNumber[temp] % 2 == 0) {
          System.out.print(arrNumber[temp] + " ");
        }
        temp++;
      }
      if (i == arrNumber.length) {
        System.out.println("");
        temp = 0;
      }     
      if (i >= arrNumber.length) {
        if (arrNumber[temp] % 2 != 0) {
          System.out.print(arrNumber[temp] + " ");
        }
        temp++;
      }
    }

//    System.out.println("Dưới đây là các số chẵn: ");
//    for (int x : arrNumber) {
//      if (x%2 == 0) {
//        System.out.print(x +" ");
//      }      
//    }
//    System.out.println("\nDưới đây là các số lẻ: ");
//    for (int x : arrNumber) {
//      if (x%2 != 0) {
//        System.out.print(x +" ");
//      }
//    }
  }
}
