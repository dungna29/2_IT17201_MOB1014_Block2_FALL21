/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_MAU_MANG_DOITUONG;

import java.util.List;
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
  List<SinhVien> _lstSinhViens;

  public SinhVienService() {
    _sc = new Scanner(System.in);
  }

  public void themSV() {
    System.out.print("Mời bạn thêm bao nhiêu SV: ");
    _input = _sc.nextLine();
    _arrSinhViens = new SinhVien[Integer.parseInt(_input)];//Khởi tạo mảng đối tượng
    for (int i = 0; i < _arrSinhViens.length; i++) {
      _arrSinhViens[i] = new SinhVien();//Phải khởi tạo đối tượng
      System.out.println("Mời bạn nhập mã: ");
      _arrSinhViens[i].setId(Integer.parseInt(_sc.nextLine()));
      System.out.println("Mời bạn nhập tên: ");
      _arrSinhViens[i].setName(_sc.nextLine());
      System.out.println("Mời bạn nhập năm sinh: ");
      _arrSinhViens[i].setYearOfBirth(_sc.nextLine());
    }
  }

  public void suaSV() {
    System.out.println("Mời bạn nhập mã: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _arrSinhViens.length; i++) {
      if (_arrSinhViens[i].getId() == Integer.parseInt(_input)) {
        System.out.println("1. Tên");
        System.out.println("2. Năm Sinh");
        System.out.println("Bạn muốn sửa thông tin gì?");
        _input = _sc.nextLine();
        switch (_input) {
          case "1":
            System.out.println("Mời bạn nhập tên mới: ");
            _arrSinhViens[i].setName(_sc.nextLine());
            break;
          case "2":
            System.out.println("Mời bạn nhập năm sinh mới: ");
            _arrSinhViens[i].setYearOfBirth(_sc.nextLine());
            break;
          default:
            System.out.println("Không có cái bạn cần sửa");
        }
        return;
      }
    }
    System.out.println("Mã sinh viên bạn chọn không tìm thấy");
  }

  public void xoaSV() {
    System.out.println("Mời bạn nhập mã: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _arrSinhViens.length; i++) {
      if (_arrSinhViens[i].getId() == Integer.parseInt(_input)) {
        _arrSinhViens[i] = new SinhVien();
        System.out.println("Xóa thành công");
        return;
      }
    }
    System.out.println("Mã sinh viên bạn chọn không tìm thấy");
  }

  public void timKiemSV() {
    System.out.println("Mời bạn nhập mã: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _arrSinhViens.length; i++) {
      if (_arrSinhViens[i].getId() == Integer.parseInt(_input)) {
        _arrSinhViens[i].inRaManHinh();
        return;
      }   
    }
    System.out.println("Mã sinh viên bạn chọn không tìm thấy");
  }

  public void xuatDsSV() {//getLstSinhVien
//    for (SinhVien x : _arrSinhViens) {
//      x.inRaManHinh();
//    }
    for (SinhVien x : _arrSinhViens) {
      if (!x.getName().equals(null)) {
         System.out.println(x.toString());
      }
     
    }
  }
}
