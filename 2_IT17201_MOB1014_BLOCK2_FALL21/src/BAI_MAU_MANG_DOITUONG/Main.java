/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_MAU_MANG_DOITUONG;

import java.util.Scanner;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author Dungna89
 */
public class Main {
  public static void main(String[] args) {
    //Code Menu ở đây
    Scanner sc = new Scanner(System.in);
    do {      
      String input;
      System.out.println("Quản lý mảng sinh viên");
      System.out.println("1. Thêm");
      System.out.println("2. Sửa");
      System.out.println("3. Xóa");
      System.out.println("4. Tìm Kiếm");
      System.out.println("5. Xuất danh sách");
      System.out.println("Mời bạn chọn chức năng: ");
      input = sc.nextLine();
      switch (input) {
        case "1":          
          break;
        case "2":          
          break;
        case "3":          
          break;
        case "4":          
          break;
        case "5":          
          break;
        default:
          System.out.println("Chức năng không tồn tại");
      }
    } while (true);
  }
}
