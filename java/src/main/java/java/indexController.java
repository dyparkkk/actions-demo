package java;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {
  public String index() {
    return "Hello World!";
  }
}
