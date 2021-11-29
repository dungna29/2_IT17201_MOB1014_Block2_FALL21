/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_MAU_LIST_DOITUONG;

import BAI_MAU_MANG_DOITUONG.*;

/**
 *
 * @author Dungna89
 */
public class SinhVien {
  private int id;
  private String name;
  private String yearOfBirth;

  public SinhVien() {
  }

  public SinhVien(int id, String name, String yearOfBirth) {
    this.id = id;
    this.name = name;
    this.yearOfBirth = yearOfBirth;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getYearOfBirth() {
    return yearOfBirth;
  }

  public void setYearOfBirth(String yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }
  
  //Dùng toString Hoặc tự viết ra 1 phương thức in ra màn hình
  //toString Alt +Insert chọn ToString

  @Override
  public String toString() {
    return "SinhVien{" + "id=" + id + ", name=" + name + ", yearOfBirth=" + yearOfBirth + '}';
  }
  
  public void inRaManHinh(){
    System.out.printf("ID: %d | TÊN: %s | NS: %s | Tuổi: %d \n",id,name,yearOfBirth, 2021- Integer.parseInt(yearOfBirth));
  }
}
