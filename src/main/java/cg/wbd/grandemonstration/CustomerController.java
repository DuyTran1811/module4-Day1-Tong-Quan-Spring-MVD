package cg.wbd.grandemonstration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    @GetMapping("/customers")
    public String showList() {
        return "customers/list";
    }

}
