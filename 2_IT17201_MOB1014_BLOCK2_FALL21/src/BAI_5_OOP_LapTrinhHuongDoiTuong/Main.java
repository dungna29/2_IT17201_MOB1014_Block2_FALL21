package BAI_5_OOP_LapTrinhHuongDoiTuong;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dungna89
 */
public class Main {

  public static void main(String[] args) {
    //Phần 1: Khởi tạo đối tượng thì cần biết tên đối tượng - Phải khởi tạo đối tượng thì mới được sử dụng   
    SinhVien sv1;//khai báo 1 đối tượng sinh viên
    //Để sử dụng được đối tượng thì phải khởi tạo
    sv1 = new SinhVien();//Khởi tạo 1 đối tượng sinh viên.     

    SinhVien sv2 = new SinhVien();  

    //Phần 2: Gán giá trị cho thuộc tính đối tượng thông qua dấu chấm.
    
    //Khi chưa Private thuộc tính
//    sv1.msv = "PH123";
//    sv1.sdt = "0123456";
//    sv1.diaChi = "1 trinh van bo";
//    sv1.namSinh = 2000;
//    sv1.truongHoc = "BK";
//    System.out.printf("%s %s %s %d %s",sv1.msv
//    ,sv1.sdt,sv1.diaChi,sv1.namSinh,sv1.truongHoc);

    //Khi các thuộc tính Private sử dụng Setter để gán giá trị
    sv1.setMsv("PH123");
    sv1.setSdt("0123456");
    sv1.setDiaChi("1 trinh van bo");
    sv1.setNamSinh(2000);
    //sv1.setTruongHoc("BK"); Khống chế không cho can thiệp vào set lại trường.
    
      //Khi sử dụng contructor có tham số thì phải truyền đúng vị trí và kiểu dữ liệu của tham số
    SinhVien sv3 = new SinhVien("PH123", "1234", "O Xac dinh", 2000);
   
    
    //Sử dụng phương thức in ra màn hình của đối tượng
    sv1.inRaManHinh();
    System.out.println(sv1.getTruongHoc());
    sv3.inRaManHinh();
  }
}
