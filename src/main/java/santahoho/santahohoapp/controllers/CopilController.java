package santahoho.santahohoapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CopilController {
    @GetMapping("/copii")
    public String getCopii() {
        return "copil";
    }
}
