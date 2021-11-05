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
public class B2_TRY_CATCH {

  public static void main(String[] args) {
    //Cách gõ: try + tab
    /*
     1. Không sử dụng try catch khi đang lập trình.
     2. Ở môi trường học tập chỉ dùng try catch khi các bạn nộp bài, mang bài lên chấm, đi bảo vệ....
     3. Trong môi trương làm việc: Chỉ khi nào đóng gói cho Tester hoặc đóng gói cho khách hàng thì bắt buộc phải dùng. 
    */
    /*
            try {
                Thực thi câu lệnh nếu xảy ra lỗi sẽ đẩy xuống catch
            } catch (Exception e) {
                Thực hiện 1 hành động nào đó khi câu lệnh trên xảy ra lỗi
            }
    */
    Scanner sc = new Scanner(System.in);
    int a;
//    try {
    System.out.println("Mời bạn nhập số nguyên: ");
    a = sc.nextInt();
    System.out.println(a);
//    } catch (Exception e) {
//      System.out.println("Lỗi rồi");
//    }
  
  }
}
