package aukcja.Api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Serwis{
    @GetMapping("/serwis")
    @ResponseBody
    public String serwis() {
        return "Serwis aukcyjny";
    }
}

