/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_4_Array_ArrayList_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Dungna89
 */
public class B5_List {
  
  
   /*
    Bài List
        - Định nghĩa: List Interface trong Java kế thừa Collection và nó cung cấp các phương thức 
                      để thao tác với các phần tử trong danh sách.
    
        + Phương thứ List    
                    - void add(int index, Object obj) || add(object value) Chèn obj vào trong List đang gọi tại index đã cho. 
                        Bất kỳ phần tử nào đã tồn tại trước tại hoặc trên điểm chèn bị bỏ qua. Vì thế, 
                        không có phần tử nào bị ghi đè.
                    - boolean addAll(int index, Collection c)	Chèn tất cả phần tử của c vào trong List
                        đang gọi tại chỉ mục đã cho. Bất kỳ phần tử nào đã tồn tại trước tại hoặc trên điểm
                        chèn bị bỏ qua. Vì thế, không có phần tử nào bị ghi đè. Trả về true nếu List đang gọi
                        thay đổi và nếu không trả về false.
                    - object get(int index)	Trả về đối tượng được lưu giữ tại index đã 
                        cho bên trong Collection đang gọi.
                    - int indexOf(Object obj)	Trả về index của sự xuất hiện đầu tiên của obj trong List đang gọi.
                        Nếu obj không là một phần tử trong list, -1 được trả về.
                    - int lastIndexOf(Object obj) Trả về index của sự xuất hiện đầu tiên của obj trong List 
                        đang gọi. Nếu obj không là một phần tử trong list, -1 được trả về
                    - ListIterator listIterator()	Sử dụng để trả về một Iterator mà bắt đầu từ phần 
                        tử đầu tiên của list.
                    - ListIterator listIterator(int index)	Sử dụng để trả về một Iterator mà phần tử bắt 
                        đầu từ chỉ số index chỉ định.
                    - object remove(int index)	Gỡ bỏ phần tử tại index từ List đang gọi và trả về phần tử 
                        bị xóa đó. List kết quả được compact lại. Đó là, các chỉ mục của dãy phần tử phụ bị 
                        lượng giảm đi 1.
                    - object set(int index, Object obj)	Gán obj tới vị trí được xác định bởi index bên trong 
                        List đang gọi.
                    - List subList(int start, int end)	Trả về một list mà bao gồm các phần tử từ start tới 
                        end-1 trong List đang gọi. Các phần tử trong list trả về cũng được tham chiếu bởi đối
                        tượng đang gọi.                        
    */
  public static void main(String[] args) {       
    //Phần 1: List Định kiểu và không định kiểu
    //Cách gõ: Học thuộc chữ ArrayL 

    //Không định kiểu:
    List lstKhongDinhKieu = new ArrayList();
    List lstKhongDinhKieu1;//Khai báo
    lstKhongDinhKieu1 = new ArrayList();//Khởi tạo thì mới dùng được.

    //Có định kiểu: (Để sử dụng kiểu dữ liệu phải gọi đến lớp kiểu dữ liệu.)
    List<Integer> lstCoDinhKieuInt = new ArrayList<Integer>();
    List<Double> lstCoDinhKieuDouble = new ArrayList<Double>();
    List<String> lstCoDinhKieuString = new ArrayList<>();

    //Phần 2: Gán giá trị với phương thức add()
    lstKhongDinhKieu.add("1");
    lstKhongDinhKieu.add(3);
    lstKhongDinhKieu.add(true);
    lstKhongDinhKieu.add(8.6);
    lstKhongDinhKieu.add('a');

    lstCoDinhKieuString.add("FPT");//Phải add đúng kiểu dữ liệu   
    lstCoDinhKieuDouble.add(9.3);

    lstCoDinhKieuInt.add(1);
    lstCoDinhKieuInt.add(2);
    lstCoDinhKieuInt.add(3);
    lstCoDinhKieuInt.add(4);
    lstCoDinhKieuInt.add(0, 9);//Chèn 1 phần tử vào vị trí được chỉ định

    //Phần 3: Truy xuất phần tử có trong danh sách với get(index);
    System.out.println(lstCoDinhKieuInt.get(0) + 5);//=14
    System.out.println(lstCoDinhKieuString.get(0) + 5);//=FPT5

    //arrLstCoDinhKieuString.size() = Kiểu
    for (int i = 0; i < lstCoDinhKieuInt.size(); i++) {
      System.out.println(lstCoDinhKieuInt.get(i));
    }
    for (Integer x : lstCoDinhKieuInt) {
      if (x % 2 == 0) {
        System.out.println(x);
      }
    }
    System.out.println("===================");
    //Phần 4: Một vài phương thức hay sử dụng
    lstCoDinhKieuInt.remove(0);//Dùng để xóa theo vị trí
    lstCoDinhKieuInt.clear();//Xóa tất cả các phần tử trong danh sách
    lstCoDinhKieuInt = new ArrayList<>();//Khởi tạo lại danh sách cũng làm mất các phần tử.

    //Sắp xếp mì ăn liền
    Collections.sort(lstCoDinhKieuInt);//Sắp xếp xuôi

    Collections.sort(lstCoDinhKieuInt);//Sắp xếp xuôi trước rồi đảo ngược
    Collections.reverse(lstCoDinhKieuInt);
    
    System.out.println(lstCoDinhKieuInt.isEmpty());//Kiểm tra danh sách rỗng
    if (lstCoDinhKieuInt.isEmpty()) {
      System.out.println("Danh xách rỗng rồi bạn êi");
      return;
    }

  }
}
