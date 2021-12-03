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
/*
- Lớp con
- Sử dụng từ khóa extends để kế thừa.
- Java || C# chỉ đơn kế thừa.
 */
public class SinhVien extends Nguoi {

  //Lớp con chỉ còn các thuộc tính đặc trưng riêng để miêu tả đối tượng
  private String msv;
  private String emailFpt;

  public SinhVien() {
  }

  public SinhVien(String msv1, String emailFpt, String ten, int namSinh, String diaChi, String sdt1, String sdt2, String cCCD) {
    super(ten, namSinh, diaChi, sdt1, sdt2, cCCD);
    msv = msv1;//Có thể bỏ this
    this.emailFpt = emailFpt;

    //super = Dùng để tham chiếu đến các thuộc tính và phương thức của lớp cha
    //this = Dùng để tham chiếu đến các thuộc tính và phương thức của lớp hiện tại
  }

  public String getMsv() {
    return msv;
  }

  public void setMsv(String msv) {
    this.msv = msv;
  }

  public String getEmailFpt() {
    return emailFpt;
  }

  public void setEmailFpt(String emailFpt) {
    this.emailFpt = emailFpt;
  }

  @Override
  public String toString() {
    return super.toString() + "SinhVien{" + "msv=" + msv + ", emailFpt=" + emailFpt + '}';
  }

  //Cách ghi đè phường thức hay còn gọi là kế thừa phương thức của lớp cha.
  //Alt + Insert -> Overide method
  
  @Override
  public void method1() {
//    super.method1(); //To change body of generated methods, choose Tools | Templates.
    System.out.println("Đây là phương thức kế thừa cha và con ghi đè lại");
  }

}
