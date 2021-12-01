/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_6_PHUONGTHUC;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Dungna89
 */
public class B1_PHUONGTHUC_VOID {

  /*
         *  Bài Phương thức - Method
         *  Định nghĩa: 1 tập các câu lệnh cùng nhau thực hiện 1 tác vụ nào đó.
         *  LỢI ÍCH: - Giúp quản lý code tốt hơn
         *           - Tái sử dụng
         *
         *  Công thức chung:
         *  <Phạm vi truy cập> <Kiểu trả về> <Tên phương thức> (<Danh sách tham số>)
         *  {
         *          Body code
         *  }
    
         * <Phạm vi truy cập> - Access Modifier:Public,Private,Protected, Default
         *
         * <Kiểu trả về> : có 2 kiểu trả về và không trả về
         *          - Kiểu không trả về: void
         *          - Kiểu trả về: là giá trị(int,string,double....) hoặc tập giá trị(Array,List.....) hoặc đối tượng(class) và còn nhiều kiểu khác.
         *
         * <Tên phương thức>: Tên động từ viết thường + tên hàm viết hóa chữ cái đầu của từ
         * <Danh sách tham số>: Phương thức có thể có tham hoặc không tham số và lưu ý khi sử dụng tham số thì khi gọi phương thức thì phải truyền đúng vị trí của tham số.
   */
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    //Phần 1: Để sử dụng được phương thức thì phải biết tên phương thức, Kiểu phương thức và phương thức đó nằm trong Class nào.
    B1_PHUONGTHUC_VOID b1 = new B1_PHUONGTHUC_VOID();
    // b1.tinhTong; Cách gọi phương thức sai
    b1.tinhTong();//Kết thúc phương thức phải là dấu ();
    
    //Phần 2: Phương thức có tham số thì cần truyền đủ, theo thứ tự, đúng kiểu dữ liệu.
    //b1.tinhTongF(); Sai vì không truyền đủ tham số hoặc thiếu
    
    //Đối với nạp chồng số lượng tham số sẽ quyết định gọi vào phương thức nào.
    b1.tinhTongF(5, 5, 5);
  }

  //Phần 1: Phương thức không trả về không tham số
  public void tinhTong()//() tham số, nếu không có thì là không tham số
  {
    int a, b;
    System.out.println("Mời bạn nhập số a: ");
    a = Integer.parseInt(sc.nextLine());
    System.out.println("Mời bạn nhập số b: ");
    b = Integer.parseInt(sc.nextLine());
    System.out.println("Tổng = " + (a + b));
  }

  //Phần 2:Phương thức không trả về có tham số
  public void tinhTongF(int a, int b)//(int a, int b) = Gọi là tham số.
  {
    System.out.println("Tổng 2 số= " + (a + b));
  }
  //Nạp chồng phương thức xem lý thuyết ở 4 tính chất OOP

  public void tinhTongF(int a, int b, int c) {
    System.out.println("Tổng 3 số= " + (a + b + c));
  }
  public void tinhTongF(int a, int b, int c,int d) {
    System.out.println("Tổng 4 số= " + (a + b + c + d));
  }
 
  //Ngoài ra còn rất nhiều kiểu tham số truyền vào
  public void method(SinhVien sv,SinhVien[] arrSV, List<SinhVien> lstSV){
    
  }
}
