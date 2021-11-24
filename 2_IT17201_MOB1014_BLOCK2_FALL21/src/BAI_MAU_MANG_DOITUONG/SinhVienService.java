/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_MAU_MANG_DOITUONG;

import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class SinhVienService {//Code toàn bộ các chức năng ở đây
  //Chuẩn bị các biến toàn cục cần sử dụng trong bài

  Scanner _sc;
  String _input;
  SinhVien[] _arrSinhViens;

  public SinhVienService() {
    _sc = new Scanner(System.in);
  }

  public void themSV() {

  }

  public void suaSV() {

  }

  public void xoaSV() {

  }

  public void timKiemSV() {

  }

  public void xuatDsSV() {
    for (SinhVien x : _arrSinhViens) {
      x.inRaManHinh();
    }
  }
}
