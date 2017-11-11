package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
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

    private List<String> getListOfStrings(){
        List<String> sampleList = new ArrayList<String>();
        sampleList.add("Bacon");
        sampleList.add("Eggs");
        sampleList.add("Gofer");
        return sampleList;
    }
}