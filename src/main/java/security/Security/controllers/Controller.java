package security.Security.controllers;
import org.springframework.web.bind.annotation.GetMapping;


@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/hello")
    public String sayHello(){
        return "hello";

    }
}
