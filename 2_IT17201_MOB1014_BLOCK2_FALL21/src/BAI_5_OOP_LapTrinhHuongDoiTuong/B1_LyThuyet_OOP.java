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
public class B1_LyThuyet_OOP {
   /*
      LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG OOP
    1. Định nghĩa:
        Lập trình hướng đối tượng (Object Oriented Programing – OOP) là đưa các đối tượng có trong thế giới thực 
        (Sinh Viên, ô tô, chó, mèo, người, hoa......) vào trong lập trình để thao tác với
        các Đối Tượng(thêm,sửa,xóa....) hoặc với các THUỘC TÍNH(Thông tin) của đối tượng. Ngoài ra đối tượng
        còn có các hành động và luôn phải là động từ thì trong lập trình nó sẽ là Method hay còn gọi là
        phương thức của đối tượng.
    
    2. 4 Tính chất của OOP:
        + Đa hình (Polymorphism): Nó thể hiện rõ nhất khi gọi đến một phương thức của đối tượng giống nhau nhưng kết quả của phương thức đó có thể khác nhau.    
            - Nạp chồng (Overloading): Nạp chồng phương thức cùng tên cùng kiểu phương thức nhưng khác tham số truyền vào. Khi đưa đúng số lượng tham số truyền vào sẽ gọi đúng phương thức cần được thực hiện.
    
            - Ghi đè (Overriding): Ghi đè phương thức có cùng tên cùng tham số giữa lớp cha và lớp con. Các phương
                thức của lớp con kế thừa từ lớp cha từ kiểu phương thức, tên, tham số truyền vào nhưng tại các lớp con 
                có thể viết lại code hành động khác theo nghiệp vụ của nó với phương thức được kế thừa.
    
        + Thừa kế (Inheritance): Cho phép định nghĩa một lớp đối tượng dựa trên các thuộc tính có sẵn của một lớp đã có.
    
        + Đóng gói (Encapsulation):Tức là trạng thái của đối tượng được bảo vệ không cho các truy cập từ code bên ngoài 
            như thay đổi trong thái hay nhìn trực tiếp. Việc cho phép môi trường bên ngoài tác động lên các dữ liệu nội 
            tại của một đối tượng theo cách nào là hoàn toàn tùy thuộc vào người viết mã. Đây là tính chất đảm bảo sự 
            toàn vẹn, bảo mật của đối tượng Trong Java, tính đóng gói được thể hiện thông qua phạm vi truy cập 
            (access modifier). Ngoài ra, các lớp liên quan đến nhau có thể được gom chung lại thành package.
    
                - Có hai loại modifier trong java: access modifiers và non-access modifiers.
                    * Có 4 kiểu của java access modifiers:
                        - private
                        - (Mặc định)
                        - protected
                        - public
                    * non-access modifiers chẳng hạn static, abstract, synchronized, native, volatile, transient, v.v..
        + Trừu tượng (Abstraction): Trừu tượng có nghĩ là tổng quát hóa một cái gì đó lên. không cần chú ý chi tiết bên trong.
            - Tính trừu tượng là một tiến trình ẩn các chi tiết trình triển khai và chỉ hiển thị tính năng tới người dùng.
              Tính trừu tượng cho phép bạn loại bỏ tính chất phức tạp của đối tượng bằng cách chỉ đưa ra các thuộc tính và 
              phương thức cần thiết của đối tượng trong lập trình.
            - Tính trừu tượng giúp bạn tập trung vào những cốt lõi cần thiết của đối tượng thay vì quan tâm đến cách nó 
              thực hiện.
            - Trong Java, chúng là sử dụng abstract class và abstract interface để có tính trừu tượng.
    
    3. Khái niệm
        - Class: Chúng ta có thể xem lớp như một khuôn mẫu (template) của đối tượng (Object). 
            Trong đó bao gồm dữ liệu của đối tượng (fields hay properties) và các phương thức(methods) 
            tác động lên thành phần dữ liệu đó gọi là các phương thức của lớp. Class là từ khóa để khai báo lớp. 
        - Đối tượng (Object): được xem là một thực thể trong thế giới thực.
        - Object bao gồm: Thuộc tính (Attribute/Method)
        - Attribute: Các thuộc tính của đối tượng
        - Phương thức:  Phương thức hay còn gọi là hàm thành viên
                        Một phương thức là một nhóm lệnh cùng nhau thực hiện một tác vụ
        - Từ khóa this trong java là một biến tham chiếu được sử dụng để tham chiếu tới đối tượng của lớp hiện tại.       
     */
  
  
  
  public static void main(String[] args) {
     
  }
  
  /*
  Bài tập
  Tạo 10 đối tượng đầy đủ 4 thành phầm và tập gọi nó ở trên main thông qua Contructor có tham số và không tham số:
1.	Nguoi(Ten,Tuoi,Sdt,DiaChi,NgaySinh,QueQuan,TrinhDo)
2.	Meo(Ten,Tuoi,DiaChi,GioiTinh,NgaySinh)
3.	GiaoVien(Ten,TenDem,HoTen,MaGV,Email1,Email2,Sdt,SoGioDay,ChucVu)
4.	SinhVien(Ten,TenDem,HoTen,MaSV,Email,Sdt,SdtNguoiThan,NganhHoc)
5.	DongVat(MaDV,TenLoai,GiongLoai,KhuVucSong,ThucAn)
6.	Oto(MaOto,HangOto,DongCo,NhienLieu,GiaTien)
7.	ThucVat(MaTV,TenLoai,KhuVuc)
8.	BanGhe(MaBG,TenBanGhe,LoaiBanGhe,ChatLieu,ChieuCao,ChieuRong)
9.	XemMay(MaXeMay,TenXeMay,HangXeMay,LoaiXeMay,NhienLieu,DongCo,GiaTien)
10.	Cho(MaCho,TenCho,GioiTinh,ThucAnYeuThich,NgaySinh)
  */
  
}
