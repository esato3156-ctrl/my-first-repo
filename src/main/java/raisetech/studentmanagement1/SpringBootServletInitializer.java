package raisetech.studentmanagement1;

import org.springframework.boot.builder.SpringApplicationBuilder;

public class SpringBootServletInitializer extends
    org.springframework.boot.web.servlet.support.SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(raisetech.studentmanagement1.Application.class);
  }
}
