package pl.sdacademy.springexercise11.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sdacademy.springexercise11.web.dto.PCGameForm;

@Controller
@RequestMapping(path = "pc-games")
public class PcGameController {

    @GetMapping
    public String showForm(ModelMap model) {
        model.addAttribute("createMessage", "Create PC Game");
        model.addAttribute("pcGameForm", new PCGameForm());
        return "pcgame";
    }

    @PostMapping
    public String submitForm(ModelMap model) {

        return "pcgame_info";
    }
}
