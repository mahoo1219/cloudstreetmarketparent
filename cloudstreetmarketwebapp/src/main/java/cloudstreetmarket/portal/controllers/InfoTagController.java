package cloudstreetmarket.portal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.StringJoiner;

@Controller
@RequestMapping("/info")
public class InfoTagController extends CloudstreetAppWCI{
    @Autowired
    private WebApplicationContext webApplicationContext;
    private final static LocalDateTime startDateTime = LocalDateTime.now();
    private final static DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("EEE, d MMM yyyy h:mm a");

    @RequestMapping("/server")
    @ResponseBody
    public String infoTagServer() {
        return new StringJoiner("<br>").add(" Server:" + webApplicationContext.getServletContext().getServerInfo()).add(" Start date: " + startDateTime.format(DATE_TIME_FORMATTER)).add(" Version : " + webApplicationContext.getBean("webAppVersion")).toString();
    }

    @RequestMapping("/helloHandler")
    @ResponseBody
    public String helloController(Model model) {
        model.addAttribute("h1", "Is it ok?");
        return "hello";
    }


}
