package santahoho.santahohoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadouController {
    @GetMapping("/cadouri")
    public String getCadouri() {
        return "cadou";
    }
}
