/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_LAMQUENVOIJAVA;

/**
 *
 * @author Dungna89
 */
public class B2_KhaiBaoBien {

  /*
      *********** Biến khái niệm cơ bản ***********
      Định nghĩa: Dùng để lưu trữ giá trị trong lập trình. Biến được lưu trữ ở trong Ram.
      Công thức: <kiểu dữ liệu> <tên biến> [=giá trị khởi đầu];
      <kiểu dữ liệu>: Giúp định nghĩa giá trị muốn lưu trữ có kiểu dữ liệu là gì
      <tên biến>:Giúp định danh và gọi biến đó khi sử dụng. Có phân biệt chữ hoa chữ thường.
      [=giá trị khởi đầu]: Đưa giá trị đúng kiểu dữ liệu
  
      *********** Quy tắc đặt tên ***********
      Tên biến có phân biệt chữ hoa và chữ thường. Nên đặt tên biến bằng Tiếng Anh
         String firstname;// Kiểu Normal  //Sử dụng khi tên biến có 2 từ trở lên
         String FirstName; //Kiểu CamelCase //Sử dụng khi tên Class có 2 từ trở lên hoặc 1 từ
         String first_name; // Kiểu Underscores //Sử dụng khi tên biến có 2 từ trở lên 
         Lưu ý: đặt tên biến không được phép bắt đầu bởi số , có dấu gạch ngang, sử dụng từ khóa của java (int,if,long....)
         int int = 5; //Vi phạm nguyên tắc đặt biến
         Trong cùng 1 class thì biến phải sử dụng tên khác nhau và đặt sao cho đúng nghĩa đại diện
      *********** Các kiểu dữ liệu có trong java ***********  
            + Kiểu số nguyên:byte, short, long, int
            + Kiểu số thực:float, double
            + Kiểu chuỗi và ký tự: String, char
            + Kiểu Logic: boolean (true, false)
            + Kiểu var: tự định nghĩa theo giá trị
  
      *********** Biến toàn cục và biến cục bộ ***********        
      + Biến toàn cục: Khai báo bên ngoài của phương thức
        - Bắt buộc phải khai báo có dấu gạch dưới _ trước tên biến:
        Ví dụ đặt tên: _firtName, _firstName;
      + Biến cục bộ: Khai báo bên trong phương thức. Biến cục bộ sẽ chỉ được sử dụng ở bên trong của 1 phương thức.  
   */
  int _year;//Biến toàn cục

  public static void main(String[] args) {
    int year;//Đây là biến cục bộ

    //1. Kiểu số nguyên
    int a1;//Khai báo 1 biến a1 có kiểu dữ liệu là int và không khởi tạo giá trị ban đầu.
    a1 = 5;//Gán giá trị cho 1 biến - Lưu ý: Giá trị phải đúng kiểu dữ liệu.
    int a2 = 6;//Khai báo 1 biến a1 có kiểu dữ liệu là int và có khởi tạo giá trị ban đầu.

    //2. Số thực:
    double d1 = 5.6;

    //3. Chuỗi
    String name = "Chương";
    String s1 = "5";
    //4. Ký tự
    char c1 = '5';

    //6. var
    var v1 = 1;
    var v2 = "1";
    var v3 = '1';
    var v4 = "Chương";
    var v5 = 5.6;
    var v6 = true;
  }
 
}
