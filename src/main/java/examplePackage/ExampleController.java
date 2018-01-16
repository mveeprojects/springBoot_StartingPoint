package examplePackage;

import org.springframework.web.bind.annotation.*;
import java.io.IOException;

@RestController
public class ExampleController {

    @RequestMapping("/")
    public String home() throws IOException {
        return "Hello World!";
    }
}