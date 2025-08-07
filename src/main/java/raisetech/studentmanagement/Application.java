package raisetech.studentmanagement;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Application {

  /*@Autowiredを入れると、springsが管理しているオートワイヤー
  を定義出来る。*/
  @Autowired
  private StudentRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  // GET: 生徒情報を取得
  @GetMapping("/student")
  // @RequestParamで入れてきた情報nameが必要
  public String getStudent(@RequestParam("name") String name) {
    //tanakaTarouを検索すると、Student studentが追加される。前回より、nameと省略出来る。
    Student student = repository.searchByName(name);
  /*データベースからデータをとった時に、
    Student.javaのStudentの名前や年齢をデータベースに
    入っている値に応じて、設定してくれると。便利な入れ物になる。*/
    return student != null
        ? student.getName() + " " + student.getAge() + "歳"
        : "Student not found.";
  }

  /* ①セレクトする,登録する、Insert（各項目での動作内容ごとに1つずつ）↓*/
  @PostMapping("/student")
  public String registerStudent(@RequestParam String name, @RequestParam int age) {
    repository.registerStudent(name, age);
    return "Registered student: " + name + ", Age: " + age;
  }

  // ②updateする。
  // PATCH: 年齢を更新
  @PatchMapping("/student")
  public String updateStudent(@RequestParam String name, @RequestParam int age) {
    repository.updateStudent(name, age);
    return "Updated student: " + name + ", Age: " + age;

  }

  //③ @PostMappingは1つのみ使用できる。重複しない。

  /*@Repository*/
  /*public class StudentRepository {

  private Map<String, Student> students = new ConcurrentHashMap<>();

  public Student searchByName(String name) {
    return students.get(name);
  }*/
  /* public void registerStudent(String name, int age) {
    students.put(name, new Student(name, age));
  }*/
  /*public void updateStudent(String name, int age) {
    Student student = students.get(name);
    if (student != null) {
      student.setAge(age);
    }
  }*/

  //　deleteする。
  // DELETE: 生徒を削除
  @DeleteMapping("/student")
  public String deleteStudent (@RequestParam String name) {
    repository.deleteStudent(name);
    return "Deleted student: " + name;

  }
}
