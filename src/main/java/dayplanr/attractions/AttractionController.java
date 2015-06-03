package dayplanr.attractions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

@Controller
public class AttractionController {

    @RequestMapping(value = "/helsinki", method = RequestMethod.GET)
    public String index(Principal principal) {
        //TODO:
        return principal != null ? "home/homeSignedIn" : "home/homeNotSignedIn";
    }
}
