/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_8_XuLyString_BieuThucChinhQuy;

/**
 *
 * @author Dungna89
 */
public class S1_XuLyChuoi {
  public static void main(String[] args) {
    // Ký tự đặc biệt \t = t\tab  \r = về đầu dòng  \n xuống dòng \\ = \  \" = "
        System.out.print("\t+ Họ và tên: Kiên\r\n\t+ Tuổi: 19");
        System.out.println("");
     
        String name = "      Fpt POLY 2020        ";

        //toLowerCase () //Cho hết về chữ thường
        System.out.println(name.toLowerCase());
        //toUpperCase () //Cho hết về chữ hoa
        System.out.println(name.toUpperCase());
        //trim() được sử dụng để xóa khoảng trẳng ở đầu và cuối chuỗi. 
        System.out.println(name + "JAVA1");
        System.out.println(name.trim() + "JAVA1");
        //length() Đo độ dài của chuỗi
        System.out.println(name.length());
        //substring()trả về chuỗi con của một chuỗi.
        String name2 = "JAVA1FPT";
        System.out.println(name2.substring(3, 5));// A1 
        System.out.println(name2.substring(3));// A1FPT  
        //charAt (index)
        System.out.println(name2.charAt(0));
        //replaceAll(find, replace)
        System.out.println(name2.replaceAll("FPT", "BKAV"));
        //split(separator)tách chuỗi này theo biểu thức chính quy(regular expression) và trả về mảng chuỗi.
        String[] words = name.split("\\s");//tach chuoi dua tren khoang trang
        //su dung vong lap foreach de in cac element cua mang chuoi thu duoc
        for (String x : words) {
            System.out.println(x);
        }
        //equals() thay dấu bằng và sử dụng với String
        System.out.println("-----------------------");
        String name1 = "Nguyen Anh Dung Nguyen Anh Dung";
        String name5 = "Do Anh Dung";
        if (name1.equals("Nguyen Anh Dung")) {
            System.out.println("Đăng nhập thành công Equals");
        }
        if (name1.contains("Nguyen Anh Dung")) {
            System.out.println("Đăng nhập thành công contains");
        }

        //equalsIgnoreCase() So sánh giống như Equals nhưng nó không quan tâm về chữ hoa hay chữ thường
        //contains()
        String name3 = "HOANG QUOC VIET";
        System.out.println(name3.contains("QUOC"));
        //startsWith()  Kiểm tra có bắt đầu bởi hay không       
        System.out.println(name3.startsWith("HOANG"));
        System.out.println(name3.startsWith("VIET"));
        //endsWith () Kiểm tra có kết thúc bởi hay không
        System.out.println(name3.endsWith("HOANG"));
        System.out.println(name3.endsWith("VIET"));
        //matches()
        String name4 = "HOANG QUOC VIET";
        System.out.print("Tra ve gia tri :");
        System.out.println(name4.matches("(.*)VIET(.*)"));//Trả ra True //regex (.*)
        System.out.println(name4.matches("VIET"));//Dùng sai nhé False

        //indexOf() Tìm vị trí đầu tiên của chuỗi con        
        System.out.println(name3.indexOf('O'));
        System.out.println(name3.indexOf("VIET"));
        //lastIndexOf()  trả vể chỉ số cuối của ký tự hoặc chuỗi con. Nếu không tìm thấy trả về -1.
        String s1 = "this is index of example";
        int index1 = s1.lastIndexOf('s');
        int index2 = s1.lastIndexOf("ex");
        System.out.println(index1);//6 
        System.out.println(index2);//17
  }
}
