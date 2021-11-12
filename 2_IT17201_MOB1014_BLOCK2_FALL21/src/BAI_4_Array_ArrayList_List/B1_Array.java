/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_4_Array_ArrayList_List;

import java.util.Scanner;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author Dungna89
 */
public class B1_Array {

  /*
         * Phần 1: Mảng 1 chiều
         *
         *  1. Định nghĩa: Mảng dùng để lưu trữ nhiều phần tử có cùng kiểu dữ liệu (Biến dùng để lưu trữ 1 giá trị có cùng kiểu dữ liệu).
         *          - Để truy xuất (để lấy giá trị) các phần tử thì cần phải biết chỉ số(index). Index là số nguyên và bắt đầu từ 0 1 2 3....
                    - Hai câu lệnh đi kèm vòng lặp: 
                      break; Ngắt vòng lặp
                      continue; Bỏ qua đoạn code phía sau và chạy sang vòng lặp tiếp theo
         *
         *  2. Khai báo 1 mảng trong JAVA:
         *          - Cách 1:
         *              <Kiểu dữ liệu>[] arr<Tên Mảng>; || <Kiểu dữ liệu> arr<Tên Mảng>[];
         *              arr<Tên Mảng> = new <Kiểu dữ liệu>[length];//Khởi tạo mảng có kích thước.
         *          - Cách 2: 
         *              <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[length];
         *
         *          - Cách 3:
         *     <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[] {value1,value2..,valuen};//Khởi tạo mảng kiểu tường minh.
         *
         *     
         *
         *  3. Truy xuất các phần tử trong mảng
         *      - Gán giá trị cho mảng:
         *           <tên mảng>[index] = Giá trị cần gán.
         *   
         *     - Lấy giá trị trong mảng:
         *          <tên mảng>[index] = Giá trị của mảng tại vị trí.
         *      Lưu ý: Để lấy nhiều giá trị trong mảng xuất ra cần sử dụng vòng lòng.
         *
         *  4. Kích thước hoặc độ dài của mảng sử dụng thuộc tính length.
         *      <tên mảng>.length = kích thước mảng có kiểu số nguyên
   */
  public static void main(String[] args) {
    //Phần 1: Khai báo mảng
    int a = 5;//Khai báo 1 biến
    int[] arrNumbers;//Khai báo 1 mảng số nguyên
    int arrNumbers1[];
    String arrNames[] = {"FPT", "FPOLY", "FU"};//Khai báo 1 mảng String có khởi tạo giá trị ban đầu và kích thước của mảng là 3.
    double[] arrDiemJavas;

    //Phần 2: Để sử dụng được mảng cần phải khởi tạo nó
    arrNumbers = new int[5];//Khởi tạo 1 mảng có 5 phần tử
    arrDiemJavas = new double[5];
    long[] arrLongs = new long[50];

    //Phần 3: Gán giá trị cho mảng thì cần biết INDEX
    //arrNumbers = 5;
    arrNumbers[0] = 88;//Gán giá trị vào index 0 trong mảng
    arrNumbers[1] = 11;
    arrNumbers[2] = 22;
    arrNumbers[3] = 33;
    arrNumbers[4] = 44;
    arrNumbers[0] = 55;//Ghi đè giá trị

    arrDiemJavas[0] = 5.6;

    //Phần 4: Truy xuất giá trị trong mảng cũng cần biết INDEX
    //Lấy 1 giá trị   
    System.out.println(arrNumbers[0]);
    System.out.println(arrNumbers[1]);
    System.out.println(arrNumbers[2]);
    System.out.println(arrNumbers[3]);
    System.out.println(arrNumbers[4]);

    //Dùng vòng lặp để in ra 
    for (var x : arrNumbers) {
      System.out.println(x);
    }
    for (int i = 0; i < arrNumbers.length; i++) {//arrNumbers.length=5
      System.out.println(arrNumbers[i]);
    }

    //Ví dụ Break và Continue áp dụng trong các vòng lặp
    //Break: Dùng để ngắt vòng lặp theo 1 điều kiện.
    //In ra màn hình các số lẻ
    System.out.println("===========Giải theo cách không dùng continue======");
    for (int i = 0; i < arrNumbers.length; i++) {
      if (arrNumbers[i] % 2 != 0) {
        System.out.println(arrNumbers[i]);
      }
    }
    for (int i = 0; i < arrNumbers.length; i++) {     
      if (arrNumbers[i] % 2 == 0) {
        continue;//Bỏ qua lần chạy hiện tại để sang lần lặp tiếp theo.
      }
      System.out.println(arrNumbers[i]);
    }
    //Bài tập: Nhập vào 1 số kiểm tra số đó có phải là số chính phương hay không?
    //Định nghĩa: Số chính phương là ba
    Scanner sc = new Scanner(System.in);
    double number;
    while (true) {
      System.out.print("Nhập 1 số: ");
      number = Double.parseDouble(sc.nextLine());
      if (Math.sqrt(number) == (int) Math.sqrt(number)) {// 2.1 == 2 => Không phải số chính phương
        System.out.println("Đây là số chính phương");
        break;
      }
      System.out.println("Mời bạn nhập lại");
    }
//    do {      
//      
//      System.out.print("Nhập 1 số: ");
//      number = Double.parseDouble(sc.nextLine());    
//    } while (!(Math.sqrt(number) == (int) Math.sqrt(number)));
//    System.out.println("Đây là số chính phương");
   
  }
}
