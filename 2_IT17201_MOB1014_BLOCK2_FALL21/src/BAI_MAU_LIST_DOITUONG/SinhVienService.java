/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_MAU_LIST_DOITUONG;

import BAI_MAU_MANG_DOITUONG.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class SinhVienService {

  Scanner _sc;
  String _input;
  List<SinhVien> _lstSinhViens;
  SinhVien _sv;

  public SinhVienService() {
    _sc = new Scanner(System.in);
    _lstSinhViens = new ArrayList<>();
    fakeData();
  }

  void fakeData() {
    _sv = new SinhVien(0, "Chương", "2003");
    _lstSinhViens.add(_sv);
    _sv = new SinhVien(1, "Trang", "2001");
    _lstSinhViens.add(_sv);
    _sv = new SinhVien(2, "Hoàng", "2002");
    _lstSinhViens.add(_sv);
  }

  public void themSV() {
    System.out.print("Mời bạn nhập số lượng: ");
    _input = _sc.nextLine();
    for (int i = 0; i < Integer.parseInt(_input); i++) {
      _sv = new SinhVien();
      System.out.print("Mời nhập ID: ");
      _sv.setId(Integer.parseInt(_sc.nextLine()));
      System.out.print("Mời nhập Tên: ");
      _sv.setName(_sc.nextLine());
      System.out.print("Mời nhập năm sinh: ");
      _sv.setYearOfBirth(_sc.nextLine());
      //Sau khi fill giá trị vào cho 1 đối tượng tiến hành thêm vào List
      _lstSinhViens.add(_sv);
    }
  }

  public void suaSV() {
System.out.println("Mời bạn nhập mã: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _lstSinhViens.size(); i++) {
      if (_lstSinhViens.get(i).getId() == Integer.parseInt(_input)) {
        System.out.println("1. Tên");
        System.out.println("2. Năm Sinh");
        System.out.println("Bạn muốn sửa thông tin gì?");
        _input = _sc.nextLine();
        switch (_input) {
          case "1":
            System.out.println("Mời bạn nhập tên mới: ");
           _lstSinhViens.get(i).setName(_sc.nextLine());
            break;
          case "2":
            System.out.println("Mời bạn nhập năm sinh mới: ");
           _lstSinhViens.get(i).setYearOfBirth(_sc.nextLine());
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
    System.out.print("Mời bạn nhập mã: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _lstSinhViens.size(); i++) {
      if (_lstSinhViens.get(i).getId() == Integer.parseInt(_input)) {
        _lstSinhViens.remove(i);
        System.out.println("Xóa thành công");
        return;
      }
    }
    System.out.println("Mã sinh viên bạn chọn không tồn tại");
  }

  public void timKiemSV() {
    System.out.print("Mời bạn nhập mã: ");
    _input = _sc.nextLine();
    for (int i = 0; i < _lstSinhViens.size(); i++) {
      if (_lstSinhViens.get(i).getId() == Integer.parseInt(_input)) {
        _lstSinhViens.get(i).inRaManHinh();
        return;
      }
    }
    System.out.println("Mã sinh viên bạn chọn không tồn tại");
  }

  public void xuatDsSV() {
    for (SinhVien x : _lstSinhViens) {
      x.inRaManHinh();
    }
  }

}
