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
public class B5_CacHamToanHoc {
  
  public static void main(String[] args) {
    // *********** Toán tử toán học trong Java ***********
    //Thự tự ưu tiên toán học (Nhân và chia -> Cộng và trừ -> Trái sang phải)
    System.out.println(5 + 7 * 2 - 4 / 2);//=17

    //Lưu ý trong lập trình: Toán tử (+) có thể sử dụng để cộng chuỗi 
    //String + String = StringString
    //Xuan + Son = XuanSon
    // *********** Các hàm toán học có sẵn trong java  ***********
    //Math.min(a, b) - Lấy số nhỏ nhất của 2 số a và b (Sử dụng nhiều)      
    //Math.max(a, b) - Lấy số lớn nhất của 2 số và b
    //Math.pow(a, n) - Bình phương 1 số
    //Math.sqrt(a)- Tính √𝑎 (căn bậc 2 của a)
    //Math.abs(a) - Lấy giá trị tuyệt đối của a
    //Math.ceil(a) -Lấy số nguyên trên của a
    //Math.floor(a) - Lấy số nguyên dưới của a
    //Math.round(a) - Làm tròn số của a
    //Math.random() - Sinh số ngẫu nhiên từ 0 đến 1 (0.0 and less than 1.0)
    System.out.println(Math.max(9, 10));//= 10

    /*
    Chương trình cho phép nhập họ và tên sinh viên, năm sinh, mã sinh viên từ bàn phím và xuất ra định dạng sau:
      “Chào bạn <<họ và tên>> | <<năm sinh>>  | <<mã sinh viên>> đến với chương trình lập trình đầu tiên.”
      Yêu cầu nhập đúng theo thứ tự đầu bài đưa ra.
    Năm sinh là số nguyên
    Msv là String.
     */
    String ten, msv;
    int ns;
    Scanner sc = new Scanner(System.in);
    System.out.println("Mời bạn nhập tên: ");
    ten = sc.nextLine();
    System.out.println("Mời bạn nhập năm sinh: ");

    //Cách 1: Sử dụng sc.nextLine(); ngày sau khi nhập xong next số
    //sc.nextLine();
    //Cách 2: Ép kiểu từ String về số và cách này sử dụng nhiều nhất.
    ns = Integer.parseInt(sc.nextLine());
    System.out.println("Mời bạn nhập msv: ");
    msv = sc.nextLine();
    System.out.printf("Chào bạn %s Năm sinh %d Msv %s", ten, ns, msv);

    //nếu sử dụng next số và sau next số là 1 next String chắc chắn bị trôi lệnh
  }
}
