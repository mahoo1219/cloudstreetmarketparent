package cloudstreetmarket.portal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

@Controller
public class DefaultController extends CloudstreetAppWCI{
    @RequestMapping(value = "/fall")
    public String fallback(Model model,Map map) {
        model.addAttribute("h1", "it's ok");
        return "index";
    }
}
