/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_7_KETHUA;

/**
 *
 * @author Dungna89
 */
public class Main {
  public static void main(String[] args) {
    //Phần 1: Khi sử dụng lớp con vẫn đầy đủ các thuộc tính của lớp cha
    SinhVien sv1 = new SinhVien("PH001", "@fpt.edu", "Chương", 0, "HN", "098", "086", "001...");
    sv1.setDiaChi("QN");
    sv1.setcCCD("002....");//Vẫn có đầy đủ get và Set của lớp cha
    System.out.println(sv1.toString());
    
    //Ghi đè phương thức
    sv1.method1();    
    Nguoi n1 = new Nguoi();
    n1.method1();
    
  }
}
