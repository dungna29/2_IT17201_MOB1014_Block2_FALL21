/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_2_TOANTU_CAULENHRENHANH;

import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class B7_ToanTuBaNgoi {

  /*
       Cách sử dụng:
        <Biểu thức> ? <Giá trị true> : <Giá trị false>;
        <Biểu thức>: Có thể có 1 hoặc nhiều biểu thức
        <Giá trị true>: Luôn nằm sau dấu ? và phụ thuộc vào kiểu dữ liệu của biến.
        <Giá trị false>: Luôn nằm sau dấu :    
   */
  public static void main(String[] args) {
    String temp1 = 5 > 5 ? "Đúng" : "Sai";
    boolean temp2 = 5 == 5 ? true : false;
    int temp3 = 5 < 5 ? 1 : 0;

    //Viết 1 chương trình nhập điểm thi java báo Trượt hoặc Qua môn
    Scanner sc = new Scanner(System.in);
    double diemJava1;
    System.out.print("Mời bạn nhập vào điểm thi: ");
    diemJava1 = Double.parseDouble(sc.nextLine());
    System.out.println(diemJava1 >= 5 ? "Qua môn" : "Mất 759k");
    //Cách dùng If Else
//    if (diemJava1>=5) {
//      System.out.println("Qua môn");
//    }else{
//      System.out.println("Mất 759k");
//    }
    /*Cố định Giới tính (Nam, Nữ), Năm sinh của chính mình. 
    Viết 1 chương trình yêu cầu người dùng nhập vào Tên, Giới Tính, Năm sinh. 
    In ra 1 câu là Chào Anh, Chào Chị, Chào em, Chào Bạn + Tên đó.
    15 Phút 4 bạn hoàn thành nhanh nhất sẽ cộng 1 điểm vào Ass1 và 2.
    Sử dụng toán tử 3 ngôi.
    */
    while (temp2) {      
      int nsMe = 2000, nsND;
      String tenND, gioiTinhND;
      System.out.print("Mời bạn nhập tên: ");
      tenND = sc.nextLine();
      System.out.print("Mời bạn nhập ns: ");
      nsND = Integer.parseInt(sc.nextLine());
      System.out.print("Mời bạn nhập gt (nam hoặc nữ): ");
      gioiTinhND = sc.nextLine();
      String kq = (nsND < nsMe && gioiTinhND.toLowerCase().equals("nam")) ? "Anh"
              : (nsND < nsMe && gioiTinhND.toLowerCase().equals("nu")) ? "Chị"
              : (nsND > nsMe && gioiTinhND.toLowerCase().equals("nu")) ? "Em gái"
              : (nsND > nsMe && gioiTinhND.toLowerCase().equals("nam")) ? "Em trai"
              : "Bạn";
      System.out.printf("Chào %s %s \n", kq, tenND);
    }
  }
}
