package raisetech.studentmanagement1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  public String index() {
    // src/main/resources/templates/index.html を返す（Thymeleafが使われている想定）
    return "index";
  }
}