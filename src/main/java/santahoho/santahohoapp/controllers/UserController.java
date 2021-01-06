package santahoho.santahohoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/useri")
    public String getUseri() {
        return "user";
    }
}
