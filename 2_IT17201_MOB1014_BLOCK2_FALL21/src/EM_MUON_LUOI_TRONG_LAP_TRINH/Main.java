/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EM_MUON_LUOI_TRONG_LAP_TRINH;

import BAI_MAU_LIST_DOITUONG.*;
import BAI_MAU_MANG_DOITUONG.*;
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
    SinhVienService svs = new SinhVienService();//Gọi chức năng sang    
    svs.getYears();
    do {      
      String input;
      System.out.println("Quản lý mảng sinh viên");
      System.out.println("1. Thêm");
      System.out.println("2. Sửa");
      System.out.println("3. Xóa");
      System.out.println("4. Tìm Kiếm");
      System.out.println("5. Xuất danh sách");    
      input = svs.getInputValue("chức năng");
      switch (input) {
        case "1":       
          svs.themSV();
          break;
        case "2":    
          //svs.suaSV();
          break;
        case "3": 
          //svs.xoaSV();
          break;
        case "4":    
          //svs.timKiemSV();
          break;
        case "5":    
          svs.xuatDsSV();
          break;
        default:
          System.out.println("Chức năng không tồn tại");
      }
    } while (true);
  }
}
