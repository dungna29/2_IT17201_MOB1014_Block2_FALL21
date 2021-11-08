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
public class B3_Wrapper {
  public static void main(String[] args) {
        //Lớp bao tương ứng với các kiểu dữ liệu nguyên thủy và có chữ cái đầu tiên viết hoa.
        //Với kiểu double thì lớp bao của nó là Double.
        //với kiểu char thì lớp bao của nó là Character
        //với kiểu sô  nguyênint thì lớp bao của nó là Integer
        //Tại các lớp Bao (Wrapper)

        Double d1 = 5.6;//Không nên khai báo biến như này
        double d2 = 5.9;//Khai báo biến kiểu số thực và khởi tạo giá trị
        Double a1 = Double.valueOf(5); // bao tường minh // có chứa giá trị kiểu số thực là 5
        Double a2 = new Double(5); // bao tường minh      
        Double a3 = 5.6; // bao ngầm định 
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        double b = a1.doubleValue();// mở bao tường minh
        double b1 = a1; // mở bao ngầm định
  }
}
