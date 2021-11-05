/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_LAMQUENVOIJAVA;

/**
 *
 * @author Dungna89
 */
public class B3_EpKieu {

  /*
        1. Ép kiểu từ String về Số
        2. Ép kiểu giữa các các số với nhau
   */
  public static void main(String[] args) {
    //1. Ép kiểu từ String về số
    String year = "2020", y = "1", kq;
    kq = year + y;//Cộng chuỗi
    System.out.println("kq = " + kq);//20201
    //Để có thể thực hiện phép cộng toán học
    int kq1 = Integer.parseInt(year) + Integer.parseInt(y);
    System.out.println("kq1 = " + kq1);

    //Ngoài ra còn rất nhiều cách ép kiểu dữ liệu khác nhau từ String về số
    //Integer.parseInt(<String>)
    //Double.parseDouble(<String>)
    //Float.parseFloat(<String>)
    //Byte.parseByte(<String>)
    //..........
    
    //2. Ép kiểu giữa các các số với nhau    
    int a = 99;
    double b = 6.7;
    //a = b; //Lỗi do Size kiểu dữ liệu int bé hơn double
    b = a;//Ép kiểu tự dộng
    a =(int) b;//Mất phần thập phân
  }
}
