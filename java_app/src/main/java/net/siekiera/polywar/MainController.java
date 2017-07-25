package net.siekiera.polywar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Eric on 25.07.2017.
 */
@Controller
public class MainController {
    @RequestMapping("/java")
    public String java() {
        return "java";
    }
}
