/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_8_XuLyString_BieuThucChinhQuy;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Dungna89
 */
public class S2_Demo {

  static Scanner _Scanner = new Scanner(System.in);

  public static void main(String[] args) {
    //nhapSo();
    do {
      System.out.println("Mời bạn nhập đầy đủ họ tên: ");
      String input = _Scanner.nextLine();
      input = input.trim();
      String[] arrFullName = input.split("\\s");//Cắt theo khoảng trắng để đưa về mảng
      for (String x : arrFullName) {
        System.out.print(vietHoaChuCaiDau(x) + " ");
      }
      System.out.println("");
    } while (true);
    
  }
  
  static String vietHoaChuCaiDau(String value){
    String temp = value.trim();
    return String.valueOf(temp.charAt(0)).toUpperCase() + temp.substring(1).toLowerCase();
  }

  public static void Bai1TimKiemGanDung() {
    List<String> lstNames = Arrays.asList("Tú", "tùng", "tOàn", "toán", "Tũn", "hoàng", "Hoàng Anh", "Hoàn");
    do {
      System.out.println("Mời bạn nhập tên: ");
      String temp = _Scanner.nextLine();
      for (String x : lstNames) {
        if (x.toLowerCase().startsWith(temp.toLowerCase())) {
          System.out.println(x);
        }
      }      
    } while (true);
  }
  
  //Biểu thức chính quy sử dụng Regex
  public static void nhapSo(){
    String input;
    do {
      System.out.println("Mời bạn nhập số: ");
      input = _Scanner.nextLine();
    } while (!checkSo(input));    
  }
  static boolean checkSo(String value){
    Pattern pattern = Pattern.compile("\\d+");
    Matcher matcher = pattern.matcher(value);
    return matcher.matches();//Trả ra số là true
  }
  static boolean checkChu(String value){
    Pattern pattern = Pattern.compile("\\w+");
    Matcher matcher = pattern.matcher(value);
    return matcher.matches();//Trả ra số là true
  }
}
