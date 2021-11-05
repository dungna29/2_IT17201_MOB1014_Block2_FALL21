/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_LAMQUENVOIJAVA;

import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class B4_NhapXuatDuLieuTuBanPhim {
    /*
       Bài 4: Nhập xuất dữ liệu từ bàn phím
    1. Xuất dữ liệu ra màn hình: In giá trị mặc định hoặc giá của biến ra màn hình
        + Công thức: sout + tab
        + System.out.println(<giá trị hoặc tập giá trị>);
        + System.out.print(<giá trị hoặc tập giá trị>);
        + System.out.printf("Chào các %s bạn đến với năm học %d",value,value);
    2. Nhập dữ liệu ra màn hình:
        + Sử dụng 1 Class: Scanner sc = new Scanner(System.in);
        + Để đọc dữ liệu thì cần định nghĩa rõ muốn lưu dữ liệu nào khi người dùng nhập.
        + Để lấy giá trị từ bàn phím: sc.next<Kiểu dữ liệu muốn>();
   */
  public static void main(String[] args) {
    //1. Xuất dữ liệu
    System.out.print("Tôi muốn trở thành");
    System.out.println(" người học không chép code");
    System.out.println(" \ttrong ngành\n UDPM");// \t = 1 tab, \n xuống dòng
    
    //Đưa ra template khi hiển thị
    String name = "Chương";
    int ns = 2003;
    System.out.println("Chào bạn " + name + " Năm sinh: "+ ns);
    System.out.printf("Chào bạn %s Năm Sinh: %d \n",name,ns);
    
    //2. Nhập dữ liệu
    //Viết 1 chương trình nhập tên vào sau đó in ra màn hình
    //Bước 1: Xác định được cần bao nhiêu biến
    String ten;
    //Bước 2: Khai báo thư viện Scanner
    Scanner sc = new Scanner(System.in);
    //Bước 3: Lấy giá trị
    System.out.print("Mời bạn nhập tên vào đây: ");
    ten = sc.nextLine();//Gán giá trị cho biến và sc.nextLine() có kiểu dữ liệu String
    //Bước 4: Thực thi
    System.out.printf("Chào bạn %s đến với FPOLY\n",ten);
  }
}
