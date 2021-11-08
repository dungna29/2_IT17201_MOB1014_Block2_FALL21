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
public class B5_CauLenh_IF_ELSE_IF {

  /*
        Câu lệnh điều kiện IF dùng để đưa ra 1 điều kiện nào đó và 
        thực hiện 1 hành động bên trong IF nếu IF(true) 
        
        - Cách dùng: if + tab
        if (true) {
            Thực hiện 1 hành động nào đó với điều kiện if phải true
        }
   */

 /*
        Bài số 6: Câu lệnh điều kiện IF ELSE (NẾU THÌ)
        Định nghĩa: Thực hiện 1 hành động khi thỏa mãn IF(TRUE) và nếu không thỏa mãn IF thì sẽ luôn vào ELSE.
        if (true) {
            Thực hiện 1 hành động nếu thỏa mãn điều kiện của IF
        }else{
            Tất cả các trường hợp không thỏa mãn IF sẽ vào ELSE
            Thực hiện 1 hành động nào đó.
        }
    
   */
 /*
        ELSE IF sử dụng trong trường hợp bài toán có nhiều điều kiện khác nhau và sẽ thực hiện những hành động cũng khác nhau.
        
        Lưu ý: ELSE IF(TRUE) phải luôn đúng thì mới thỏa mãn vào bên trong nó tương tự như IF
        . Nhưng chỉ vào 1 điều kiện thỏa mãn không vào nhiều IF hoặc ELSE IF khi sử dụng.
        if (true) {
            //Thỏa mãn điều kiện IF(True)
            Thực hiện 1 hành động nào đó
        }
        else if (true) {
           //Khi IF không thỏa mãn thì mới tiếp tục đến Else IF(True)
           Thực hiện 1 hành động nào đó
        }
        else if (true) {
           //Khi IF không thỏa mãn thì mới tiếp tục đến Else IF(True)
           Thực hiện 1 hành động nào đó
        }else{
            Khi tất cả các trường hợp trên không thỏa mãn thì sẽ vào đây.
        }
   */
  public static void main(String[] args) {
    //. Phần 1: If
    boolean b1 = false;
    if (b1 == false) {
      //Thực hiện 1 hành động khi if true     
    }

    //Ví dụ: ĐIểm thi >= 5 thì qua môn còn ngược lại thì học lại.
//    double diemJava = 5;
//    if (diemJava>=5) {
//      System.out.println("Qua môn");
//      return;
//    }
//    System.out.println("Học lại");
    //Phần 2: If Else
    double diemJava = 5;
    if (diemJava >= 5) {
      System.out.println("Qua môn");
    } else {
      System.out.println("Chúc mừng bạn mất 759k");
    }//Khi không thỏa mãn If thì luôn vào else
    /*
            Viết 1 chương trình cho phép nhập điểm THI JAVA
            9 - 10 = Xuất sắc
            8 - 9 = Giỏi
            7 - 8 = khá
            5 - 6 = trung bình
            0 - 5 = Học lại    
      Hãy giải bài tập này không được sử dụng Else IF hoặc IF. Chỉ được giải bằng IF Else. Và bên trong mỗi IF else đều phải thực thi hành động.
     */
    Scanner sc = new Scanner(System.in);
    double diem;
    System.out.println("Mời bạn nhập điểm: ");
    diem = Double.parseDouble(sc.nextLine());
    if (diem >= 9 && diem <= 10) {
      System.out.println("Xuất sắc");
    } else {
      if (diem >= 8 && diem < 9) {
        System.out.println("Giỏi");
      } else {
        if (diem >= 7 && diem < 8) {
          System.out.println("Khá");
        } else {
          if (diem >= 5 && diem < 7) {
            System.out.println("TB");
          } else {
            if (diem >= 0 && diem < 5) {
              System.out.println("Mất 759k");
            } else {
              System.out.println("Điểm không tồn tại");
            }
          }
        }
      }
    }
    //Phần 2: Else If dùng mở rộng điều kiện
    if (true) {

    } else if (b1) {

    } else if (b1) {

    } else if (b1) {

    } else {

    }
  }

}
