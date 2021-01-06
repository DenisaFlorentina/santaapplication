package santahoho.santahohoapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import santahoho.santahohoapp.models.Tara;
import santahoho.santahohoapp.services.TaraService;

import java.util.List;

@Controller
public class TaraController {
    @Autowired
    private TaraService taraService;

    @GetMapping("/tari")
    public String getTari(Model model){
        List<Tara> listaTari = taraService.getTara();
        model.addAttribute("tari", listaTari);
        return "Tara";
    }

    @PostMapping("/tari/addnew")
    public String addNew(Tara tara) {
        taraService.save(tara);
        return "redirect:/tari";
    }
}
