package pl.sdacademy.springexercise11.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.sdacademy.springexercise11.web.dto.PCGameForm;

import javax.validation.Valid;

@Controller
@RequestMapping(path = "pc-games")
public class PcGameController {
    private static final String CREATE_GAME_HEADER = "Create PC Game";

    @GetMapping
    public String showForm(ModelMap model) {
        model.addAttribute("createMessage", CREATE_GAME_HEADER);
        model.addAttribute("pcGameForm", new PCGameForm());
        return "pcgame";
    }

    @PostMapping
    public String submitForm(ModelMap model, @ModelAttribute("pcGameForm") @Valid PCGameForm form, Errors errors) {
        if (errors.hasErrors()) {
            model.addAttribute("createMessage", CREATE_GAME_HEADER);
            model.addAttribute("pcGameForm", form);
            return "pcgame";
        }
        model.addAttribute("pcGame", form);
        return "pcgame_info";
    }
}
