/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_6_PHUONGTHUC;

/**
 *
 * @author Dungna89
 */
public class B2_PHUONGTHUC_TRAVE {

  /*
  Phương thức trả về
           *  Công thức chung:
         *  <Phạm vi truy cập> <Kiểu trả về> <Tên phương thức> (<Danh sách tham số>)
         *  {
         *          Body code
                  return <Giá trị có kiểu của phương thức>;
         *  }
   */
  public static void main(String[] args) {
    B2_PHUONGTHUC_TRAVE b2 = new B2_PHUONGTHUC_TRAVE();
    //Cách sử dụng
    //Phải coi phương thức trả về nó là 1 giá trị, hoặc tập giá trị, đối tượng......
    int a = 5;
    b2.tinhTong();//Không thể tự in ra 1 giá trị
    System.out.println(b2.tinhTong());
    System.out.println(b2.tinhTong() + 10);
    
    int temp[] = b2.getAllYears();
    for (int i = 0; i < b2.getAllYears().length; i++) {
      System.out.println(b2.getAllYears()[i]);
    }
  }
  
  //Bài tập Viết 1 phương thức trả về 1 tập giá trị năm 1900 - 2021
  public int[] getAllYears(){
    int[] arrYears = new int[2022-1900];
    int temp = 1900;
    for (int i = 0; i < arrYears.length; i++) {
      arrYears[i] = temp;
      temp++;
    }
    return arrYears;
  }
  //Phương thức trả về không tham số
  public int tinhTong() {
    int a = 5, b = 9;
    return a + b; //Trả về đúng kiểu dữ liệu
  }
  
  
}
