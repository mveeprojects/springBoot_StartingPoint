package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class SampleController {

    @RequestMapping("/")
    public String homeController(Model model) {
        model.addAttribute("title", "Home");
        model.addAttribute("content", "Hello there :)");
        model.addAttribute("listOfStrings", getListOfStrings());
        return "index";
    }

    @RequestMapping("/hi")
    public String anotherController(Model model) {
        model.addAttribute("title", "This is another controller");
        model.addAttribute("content", "Hi :)");
        return "index";
    }

    private List<String> getListOfStrings() {
        return Arrays.asList("Bacon", "Eggs", "Gofer");
    }
}