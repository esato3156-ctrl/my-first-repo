package raisetech.studentmanagement1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.*;

@Mapper
  /*@Mapperつけると、interfaceで生成出来ないものがインスタンス
  生成できるように。*/
public interface StudentRepository {

  //nameはデータベースの名前,#{name}"は(String name);のnameの事
  // データベースから名前で検索
  @Select("SELECT * FROM student WHERE name = #{name}")
  //Student findByNameも、searchByNameやsearchByIDも可↓
  Student searchByName(String name);

    /* Application.java内の@PostMapping("/studentInfo")
     public void setStudentInfo(String name, String age){
     と記述しており、それに併せて下記記述*/

  // 新しい生徒を登録
  @Insert("INSERT INTO student (name, age) VALUES (#{name}, #{age})")
  //void creat　か　register (これでインスタンスが出来る。)
  void registerStudent(String name, int age);

  // 年齢を更新
  @Update("UPDATE student SET age = #{age} WHERE name = #{name}")
  void updateStudent(String name, int age);

  // 生徒を削除
  @Delete("DELETE FROM student WHERE name = #{name}")
  void deleteStudent(String name);

}
