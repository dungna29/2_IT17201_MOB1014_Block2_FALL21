/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_4_Array_ArrayList_List;

import java.util.Arrays;

/**
 *
 * @author Dungna89
 */
public class B3_ThuatToanNoiBot_BubbleSort {

  public static void main(String[] args) {
    int[] arrNumber = {8, 7, 6, 5};

    for (int x : arrNumber) {
      System.out.print(x + " ");
    }
    //Phần 1: Áp dụng thuật toán
//    for (int i = 0; i < arrNumber.length - 1; i++) {
//      for (int j = i + 1; j < arrNumber.length; j++) {
//        if (arrNumber[i] > arrNumber[j]) {
//          int temp = arrNumber[i];
//          arrNumber[i] = arrNumber[j];
//          arrNumber[j] = temp;
//        }
//      }
//    }
    System.out.println("");
    for (int i = 0; i < arrNumber.length - 1; i++) {
      System.out.println("Lần chay thứ: " + i);
      for (int x : arrNumber) {
        System.out.print(x + " ");
      }
      System.out.println("");
      for (int j = i+1; j < arrNumber.length; j++) {
        System.out.printf("Điều kiện %d > %d \n", arrNumber[i], arrNumber[j]);
        if (arrNumber[i] > arrNumber[j]) {
          int temp = arrNumber[i];
          arrNumber[i] = arrNumber[j];
          arrNumber[j] = temp;
          System.out.printf("Hoán vị của: %d & %d \n", arrNumber[i], arrNumber[j]);
          for (int x : arrNumber) {
            System.out.print(x + " ");
          }
          System.out.println("");
        }
      }
    }
    System.out.println("");
    for (int x : arrNumber) {
      System.out.print(x + " ");
    }
  }
}
