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
//Lớp cha cũng như bao lớp khác
public class Nguoi {

  //Đưa các thuộc tính chung lên lớp cha
  private String ten;
  private int namSinh;
  private String diaChi;
  private String sdt1;
  private String sdt2;
  private String cCCD;

  public Nguoi() {
  }

  public Nguoi(String ten, int namSinh, String diaChi, String sdt1, String sdt2, String cCCD) {
    this.ten = ten;
    this.namSinh = namSinh;
    this.diaChi = diaChi;
    this.sdt1 = sdt1;
    this.sdt2 = sdt2;
    this.cCCD = cCCD;
  }

  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }

  public int getNamSinh() {
    return namSinh;
  }

  public void setNamSinh(int namSinh) {
    this.namSinh = namSinh;
  }

  public String getDiaChi() {
    return diaChi;
  }

  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }

  public String getSdt1() {
    return sdt1;
  }

  public void setSdt1(String sdt1) {
    this.sdt1 = sdt1;
  }

  public String getSdt2() {
    return sdt2;
  }

  public void setSdt2(String sdt2) {
    this.sdt2 = sdt2;
  }

  public String getcCCD() {
    return cCCD;
  }

  public void setcCCD(String cCCD) {
    this.cCCD = cCCD;
  }

  @Override
  public String toString() {
    return "Nguoi{" + "ten=" + ten + ", namSinh=" + namSinh + ", diaChi=" + diaChi + ", sdt1=" + sdt1 + ", sdt2=" + sdt2 + ", cCCD=" + cCCD + '}';
  }
  
  
  public void method1(){
    System.out.println("Đây là phương thức của lớp Cha");
  }
  private void method2(){
    
  }
}
