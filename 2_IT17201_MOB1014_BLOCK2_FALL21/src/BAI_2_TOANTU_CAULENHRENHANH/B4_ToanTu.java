/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_2_TOANTU_CAULENHRENHANH;

/**
 *
 * @author Dungna89
 */
public class B4_ToanTu {

  /*
         * 4 Loại toán tử trong lập trình
         *  1. Toán tử số học:
         *  (+ - * / % ++ --)
         *      +: Tính tổng của 2 số hoặc dùng để cộng chuỗi
         *      -: Phép trừ của 2 số
         *      *: Phép nhân của 2 số 
         *      %: Phép chia lấy dư của 2 số
         *      ++: Tăng lên 1 đơn vị
         *      --: Giảm 1 đơn vị
         *  2. Toán tử so sánh: 
         *  (> < >= <= == !=)
         *      >: Lớn hơn
         *      <: nhỏ hơn
         *      >=: lớn hơn hoặc bằng
         *      <=: nhỏ hơn hoặc bằng
         *      ==: so sánh bằng 
         *      !=: so sánh khác
         *  3. Toán tử Logic: dùng để nối mệnh đề
         * (&& || !)
         *      &&: Yêu cầu các mệnh đề phải luôn đúng
         *      ||: Yêu cầu 1 trong các mệnh đề dúng là được
         *      !: Lấy giá trị phủ định của mệnh đề.
         *  4. Toán tử gán:
         * (= += -= *= /= %=)
         *      +=: Cộng tiếp với vế bên phải các phép còn lại tương tự
   */
  public static void main(String[] args) {
    int nghi = 4;
    double diemThi = 4.9, gpa = 5.0;
    System.out.println(nghi >= 5 && diemThi >= 5 && gpa >= 5);//Fales
    System.out.println(nghi >= 5 || diemThi >= 5 || gpa >= 5);//True
    int a = 5;
    a+=5;//Viết tường minh hơn a = a + 5;
  }
}
