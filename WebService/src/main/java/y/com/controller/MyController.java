package y.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/my")
public class MyController {
    @RequestMapping("/index")
    public String index(){

        return "index";
    }
}
