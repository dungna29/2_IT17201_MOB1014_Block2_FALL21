/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_2_TOANTU_CAULENHRENHANH;

/**
 *
 * @author Dungna29
 */
public class B1_KieuDuLieu {
    public static void main(String[] args) {
         //Kiểu dữ liệu bào gồm các kiểu sau (int, double, float...)

        //Cách khai báo biển theo các kiểu dữ liệu khác nhau!
        //1.Kiểu dữ liệu số nguyên:     
        byte b = 0;
        short sh = 9;
        int in = 8;// Hay sử dụng
        long l = 7;
        long l1 = 7l;
        long l2 = 7L;
                
        //2. Kiểu số thực:
        float f1 = 9.5f;//Khai báo f hoặc F đều được nhưng phải có
        float f2 = 9.5F;
        float f21 = (float) 9.5;//Ko sử dụng cách này
        double d1 = 8.2;//Hay sử dụng
        double d2 = 8.2d;
        double d3 = 8.2D;
                
        //3. Kiểu ký tự:
        char c = '1';
        char c1 = 'A';
        
        
        //4. Kiểu logic:
        boolean bl = true;
        boolean b2 = false;
        
        //5. Kiểu chuỗi:
        String str = "JAVA1";
        
        //Khai báo biến kiểu số nguyên Byte
        byte temp1 = 127;
        // Tìm ra giá trị lớn nhất mà Byte có thể chứa
        System.out.println(Byte.MAX_VALUE);
        // Tìm ra giá trị nhỏ nhất mà Byte có thể chứa
        System.out.println(Byte.MIN_VALUE);
        
        //Các bạn có thể thử tìm các giá trị max min của các kiểu dữ liệu khác theo cách trên.
    }
}
