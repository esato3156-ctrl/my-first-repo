package raisetech.studentmanagement1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController  // 文字列をそのまま返すなら @RestController
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  //SpringBootのSpringBootServletInitializerを使用してプロジェクトを生成し、ダウンロードしましょう。
  //Localhost:8080にアクセスしてエラーが出る事を確認し、
  //Hello,world!が表示出来るようにマッピングをして実行しましょう。
  //その後、文字やメゾット名、URLを変更して実行しましょう。
  @GetMapping("/hello") // ← このURLでアクセス
  public String helloUser() { // ← メソッド名は任意（indexでもok)
   return "Hello, World!"; // ← この文字列を返す
  }
}

