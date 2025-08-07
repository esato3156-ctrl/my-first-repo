package raisetech.studentmanagement;

import com.fasterxml.jackson.annotation.JsonTypeId;

/*-------------------------------------------------------------------------------
■対面指導 課題１
SQLを用いてstudentテーブルに新たにplace_of_birth(出生地)フィールドというVARCHAR型の
フィールドを追加する。その上で、コードにも変更を反映させ、curlコマンドを使用して
フィールドが正しく追加されていることを確認しましょう。
----------------------------------------------------------------------------------
★対面指導 課題1の解説
ALTER TABLE文と、コードの変更点を解説する。
----------------------------------------------------------------------------------*/
    //★対面指導 課題1 ここから　Student.javaへplaceOfBirthフィールドとgetter&setterの追加
private String placeOfBirth;
    public String getPlaceOfBirth() {
      return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
      this.placeOfBirth = placeOfBirth;
    }
    //★対面指導 課題1 ここまで


public class Student {
  /*public Student(String name, int age) {
    this.name = name;
    this.age = age; */
  /* } */

  private String name;
  private Integer age;

  public Long getId() {
    return id;
  }

  // getter
  public String getName() {
    return name;
  }

  /*
  public int getAge() {
    return age;*/
  /*}*/

  // setter
  public void setName(String name) {
    this.name = name;
  }

  /*
  public void setAge(int age) {
    this.age = age; */
  /* } */

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}















