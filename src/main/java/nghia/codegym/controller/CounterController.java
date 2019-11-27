package nghia.codegym.controller;

import nghia.codegym.model.Mycounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("mycounter")
public class CounterController {

    /* add MyCounter in model attribute */
    @ModelAttribute("mycounter")
    public Mycounter setUpCounter() {
        return new Mycounter();
    }

    @GetMapping("/")
    public String get(@ModelAttribute("mycounter") Mycounter myCounter) {
        myCounter.increment();
        return "index";
    }
}
