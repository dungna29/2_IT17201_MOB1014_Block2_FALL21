/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_4_Array_ArrayList_List;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Dungna89
 */
public class B4_ArrayList {

  /*
    Bài ArrayList
        - Định nghĩa: Lớp ArrayList trong java được sử dụng như một mảng động để lưu trữ các phần tử. 
                      ArrayList được tạo với một kích cỡ ban đầu. Khi kích cỡ này bị vượt, collection 
                      tự động được tăng. Khi các đối tượng bị gỡ bỏ, ArrayList có thể bị giảm kích cỡ.
        + Lưu ý:
                -   Có thể chứa các phần tử trùng lặp.
                -   Duy trì thứ tự của phần tử được thêm vào.
                -   Không đồng bộ (non-synchronized).
                -   Cho phép truy cập ngẫu nhiên, tốc độ truy xuất (get) phần tử nhanh vì nó lưu dữ liệu theo chỉ mục.
                -   Thao tác thêm/ xóa (add/ remove) phần tử chậm vì cần nhiều sự dịch chuyển nếu bất kỳ phần tử nào thêm/ xoá khỏi danh sách.
    
        + Phương thứ ArrayList    
                - boolean add(Object o)	Thêm phần tử được chỉ định vào cuối một danh sách.
                - void add(int index, Object element) || add(Object value) Chèn một phần tử được chỉ định 
                  tại vị trí (index) được chỉ định vào danh sách. 
                  Ném IndexOutOfBoundsException nếu index này ở bên ngoài dãy (index < 0 hoặc index > size()).
                - boolean addAll(Collection c)	Thêm tất cả các phần tử trong collection được chỉ định vào 
                  cuối của danh sách gọi phương thức, theo thứ tự chúng được trả về bởi bộ lặp iterator.
                - boolean addAll(int index, Collection c)	Thêm tất cả các phần tử trong collection được 
                  chỉ định vào danh sách gọi phương thức, bắt đầu từ vị trí đã chỉ định. 
                  Ném NullPointerException nếu collection đã cho là null.
                - Object get(int index)	Trả về phần tử tại index đã cho. 
                  Ném IndexOutOfBoundsException nếu index đã cho là ở bên ngoài dãy 
                  (index < 0 hoặc index >= size()).
                - int indexOf(Object o)	Lấy vị trí (index) trong danh sách với sự xuất hiện đầu tiên
                của phần tử được chỉ định, hoặc -1 nếu danh sách không chứa phần tử này.
                - int lastIndexOf(Object o) Lấy vị trí (index) trong danh sách với sự xuất hiện cuối
                cùng của phần tử được chỉ định, hoặc -1 nếu danh sách không chứa phần tử này.
                - Object remove(int index) Gỡ bỏ phần tử tại index đã cho. 
                Ném IndexOutOfBoundsException nếu index ở ngoài dãy (index < 0 hoặc index >= size()).
                - void retainAll(Collection c)	Xóa những phần tử không thuộc collection c và 
                không thuộc list hiện tại khỏi list hiện tại. 
                Ném NullPointerException nếu collection đã cho là null.
                - void removeAll(Collection c)	Xóa những phần tử thuộc collection c và thuộc list hiện 
                tại khỏi list hiện tại. Ném NullPointerException nếu collection đã cho là null.
                - Object set(int index, Object element)	Thay thế phần tử tại vị trí đã cho trong list này với phần tử đã xác định. Ném IndexOutOfBoundsException nếu index ở ngoài dãy (index < 0 hoặc index >= size()).
                - Object[] toArray()	Chuyển một danh sách sang mảng và trả về một mảng chứa tất cả các phần tử trong danh sách này theo đúng thứ tự. Ném NullPointerException nếu mảng này là null.
                - Object[] toArray(Object[] a)	Chuyển một danh sách sang mảng và trả về một mảng chứa tất cả các phần tử trong danh sách này theo đúng thứ tự. Kiểu runtime là của mảng trả về giống như mảng đã xác định.
                - Object clone()	Tạo một bản sao của ArrayList.
                - void clear()	Xóa tất cả các phần tử từ danh sách.
                - void trimToSize()	Cắt dung lượng của thể hiện ArrayList này là kích thước danh sách hiện tại.
   */
  public static void main(String[] args) {
    //Phần 1: ArrayList Định kiểu và không định kiểu
    //Cách gõ: Học thuộc chữ ArrayL 

    //Không định kiểu:
    ArrayList arrLstKhongDinhKieu = new ArrayList();
    ArrayList arrLstKhongDinhKieu1;//Khai báo
    arrLstKhongDinhKieu1 = new ArrayList();//Khởi tạo thì mới dùng được.

    //Có định kiểu: (Để sử dụng kiểu dữ liệu phải gọi đến lớp kiểu dữ liệu.)
    ArrayList<Integer> arrLstCoDinhKieuInt = new ArrayList<Integer>();
    ArrayList<Double> arrLstCoDinhKieuDouble = new ArrayList<Double>();
    ArrayList<String> arrLstCoDinhKieuString = new ArrayList<>();

    //Phần 2: Gán giá trị với phương thức add()
    arrLstKhongDinhKieu.add("1");
    arrLstKhongDinhKieu.add(3);
    arrLstKhongDinhKieu.add(true);
    arrLstKhongDinhKieu.add(8.6);
    arrLstKhongDinhKieu.add('a');

    arrLstCoDinhKieuString.add("FPT");//Phải add đúng kiểu dữ liệu   
    arrLstCoDinhKieuDouble.add(9.3);

    arrLstCoDinhKieuInt.add(1);
    arrLstCoDinhKieuInt.add(2);
    arrLstCoDinhKieuInt.add(3);
    arrLstCoDinhKieuInt.add(4);
    arrLstCoDinhKieuInt.add(0, 9);//Chèn 1 phần tử vào vị trí được chỉ định

    //Phần 3: Truy xuất phần tử có trong danh sách với get(index);
    System.out.println(arrLstCoDinhKieuInt.get(0) + 5);//=14
    System.out.println(arrLstCoDinhKieuString.get(0) + 5);//=FPT5

    //arrLstCoDinhKieuString.size() = Kiểu
    for (int i = 0; i < arrLstCoDinhKieuInt.size(); i++) {
      System.out.println(arrLstCoDinhKieuInt.get(i));
    }
    for (Integer x : arrLstCoDinhKieuInt) {
      if (x % 2 == 0) {
        System.out.println(x);
      }
    }
    System.out.println("===================");
    //Phần 4: Một vài phương thức hay sử dụng
    arrLstCoDinhKieuInt.remove(0);//Dùng để xóa theo vị trí
    arrLstCoDinhKieuInt.clear();//Xóa tất cả các phần tử trong danh sách
    arrLstCoDinhKieuInt = new ArrayList<>();//Khởi tạo lại danh sách cũng làm mất các phần tử.

    //Sắp xếp mì ăn liền
    Collections.sort(arrLstCoDinhKieuInt);//Sắp xếp xuôi

    Collections.sort(arrLstCoDinhKieuInt);//Sắp xếp xuôi trước rồi đảo ngược
    Collections.reverse(arrLstCoDinhKieuInt);
    
    System.out.println(arrLstCoDinhKieuInt.isEmpty());//Kiểm tra danh sách rỗng
    if (arrLstCoDinhKieuInt.isEmpty()) {
      System.out.println("Danh xách rỗng rồi bạn êi");
      return;
    }

  }
}
