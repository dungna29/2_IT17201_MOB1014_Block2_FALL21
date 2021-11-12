/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_3_VONGLAP;

/**
 *
 * @author Dungna89
 */
public class B2_FOREACH {
  
    /*
    Cách gõ: fore + tab
    
    Công thức:  
    for (String arg : args) {
            
        }
    String arg: Kiểu dữ liệu và tên biến, tên biến sẽ đại diện là 1 giá trị
    args: Là Collection hoặc là 1 Array
     */
  public static void main(String[] args) {
    String[] arrTens={"Dũng","Thao","Trang"};
    
    for (var x : arrTens) {
      System.out.println(x);
    }
    for (int i = 0; i < arrTens.length; i++) {
      System.out.println(arrTens[i]);
    }
  }
}
