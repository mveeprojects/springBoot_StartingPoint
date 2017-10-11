package hello;

import org.springframework.web.bind.annotation.*;
import java.io.IOException;

@RestController
public class SampleController {

    @RequestMapping("/")
    public String home() throws IOException {
        return "Hello World!";
    }
}