/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EM_MUON_LUOI_TRONG_LAP_TRINH;

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
  /////////////////////////////

  public void themVoToiVa() {
    int i = 1;
    while (!(i == 0)) {
      _lstSinhViens.add(new SinhVien(Integer.parseInt(getInputValue("Id")), getInputValue("tên"), getInputValue("năm sinh")));
      i = Integer.parseInt(getInputValue(" tiếp hoặc không? 1-Có || 0 - không"));
    }
  }

  //////////////////////////////
  public void themSV() {
    _input = getInputValue("số lượng");
    for (int i = 0; i < Integer.parseInt(_input); i++) {
      _lstSinhViens.add(new SinhVien(Integer.parseInt(getInputValue("Id")), getInputValue("tên"), getInputValue("năm sinh")));
    }
  }

  public void suaSV() {
    int temp = getIndexById(Integer.parseInt(getInputValue("mã")));
    if (temp == -1) {
      System.out.println("Mã sinh viên bạn chọn không tồn tại");
      return;
    }
    System.out.println("1. Tên");
    System.out.println("2. Năm Sinh");
    System.out.println("Bạn muốn sửa thông tin gì?");
    _input = _sc.nextLine();
    switch (_input) {
      case "1":
        System.out.println("Mời bạn nhập tên mới: ");
        _lstSinhViens.get(temp).setName(_sc.nextLine());
        break;
      case "2":
        System.out.println("Mời bạn nhập năm sinh mới: ");
        _lstSinhViens.get(temp).setYearOfBirth(_sc.nextLine());
        break;
      default:
        System.out.println("Không có cái bạn cần sửa");
    }
  }

  public void xoaSV() {
    int temp = getIndexById(Integer.parseInt(getInputValue("mã")));
    if (temp == -1) {
      System.out.println("Mã sinh viên bạn chọn không tồn tại");
      return;
    }
    _lstSinhViens.remove(temp);
    System.out.println("Xóa thành công");
  }

  public void timKiemSV() {
    int temp = getIndexById(Integer.parseInt(getInputValue("mã")));
    if (temp == -1) {
      System.out.println("Mã sinh viên bạn chọn không tồn tại");
      return;
    }
    _lstSinhViens.get(temp).inRaManHinh();
  }

  public void xuatDsSV() {
    for (SinhVien x : _lstSinhViens) {
      x.inRaManHinh();
    }
  }

  public String getInputValue(String msg) {
    System.out.printf("Mời bạn nhập %s: ", msg);
    return _sc.nextLine();
  }

  public int getIndexById(int id) {
    for (int i = 0; i < _lstSinhViens.size(); i++) {
      if (_lstSinhViens.get(i).getId() == id) {
        return i;
      }
    }
    return -1;
  }
  public int getIndexById(String id) {
    for (int i = 0; i < _lstSinhViens.size(); i++) {
      if (_lstSinhViens.get(i).getId() == Integer.parseInt(id)) {
        return i;
      }
    }
    return -1;
  }
 

  public void getYears() {
    int[] temp = getAllYears(new int[2022 - 1900], 1900, 0);
    for (int i : temp) {
      System.out.println(i);
    }
  }

  public int[] getAllYears(int[] arrYears, int temp, int i) {
    if (i < arrYears.length) {
      arrYears[i] = temp;
      temp++;
      i++;
      getAllYears(arrYears, temp, i);
    }
    return arrYears;
  }
}
