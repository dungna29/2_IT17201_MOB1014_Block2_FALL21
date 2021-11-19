/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_5_OOP_LapTrinhHuongDoiTuong;

/**
 *
 * @author Dungna89
 */
/*
1. Tạo ra 1 Class(lớp) đối tượng sinh viên
2. Tên đối tượng phải viết hoa chữ cái đầu
*/
public class SinhVien {
  //Phần 1: Liệt kê các thuộc tính mà đối tượng cần có.
 private String msv; //Private các thuộc tính lại
 private String sdt;//Khi private thì sẽ chỉ được phép sử dụng nó bên trong class.
 private String diaChi;
 private int namSinh;  
 private String truongHoc = "FPT";
 
 //Phần 2: Contructor khi mới học luôn có 2 Contructor
 /*
        - Tên Contructor phải giống với tên class và có từ khóa public
        - Khi khởi tạo đối tượng thì Contructor luôn là thành phần chạy đầu tiên
            trong class đối tượng đó.
        - Contructor không tham số dùng để khởi tạo đối tượng ko có giá trị ban đầu
        - Contructor có tham số  để khởi tạo đối tượng có ngay giá trị
        - Nếu khi khởi tạo đối tượng mà đối tượng không có contructor nào thì chương trình sẽ tự động khởi tạo cho đối tượng đó 1 contructor mặc định đó là contructor không tham số.
 */
 
  //2.1 Contructor không tham số: Alt + insert hoặc chuột phải chọn Insert code.->Contructor
  public SinhVien() {
    System.out.println("Contructor chạy nè");
  }
  
 //2.2 Contructor có tham số: Alt + insert hoặc chuột phải chọn Insert code.->Contructor - Select All
  public SinhVien(String msv, String sdt, String diaChi, int namSinh) {
    this.msv = msv;
    this.sdt = sdt;
    this.diaChi = diaChi;
    this.namSinh = namSinh;
  }
  
  //Phần 3:Getter và Setter Vì khi thuộc tính bị Priavate muốn lấy và gán giá trị cho nó thì phải sử dụng
  // Alt + Insert chọn Getter và Setter -> Select All
  public String getMsv() {
    return msv;
  }

  public void setMsv(String msv) {
    this.msv = msv;
  }

  public String getSdt() {
    return sdt;
  }

  public void setSdt(String sdt) {
    this.sdt = sdt;
  }

  public String getDiaChi() {
    return diaChi;
  }

  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }

  public int getNamSinh() {
    return namSinh;
  }

  public void setNamSinh(int namSinh) {
    this.namSinh = namSinh;
  }

  public String getTruongHoc() {
    return truongHoc;
  }

//  public void setTruongHoc(String truongHoc) {
//    this.truongHoc = truongHoc;
//  }
  
  //Phần 4: Các phương thức của đối tượng phải là động từ đứng trước
  public void inRaManHinh(){
    System.out.printf("MSV: %s %s %s %d %s",getMsv(), sdt,diaChi,namSinh,truongHoc);
  }
}
