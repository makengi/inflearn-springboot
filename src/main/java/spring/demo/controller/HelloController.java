package spring.demo.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class HelloController {
    @RequestMapping("hello")
    public String hello(Model model){
        log.info("@ hello Controller!");
        model.addAttribute("data","hello!!!");
        return "hello";
    };

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(value = "name",required = false) String name, Model model){
        model.addAttribute("name",name);
        return "hello-template";
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello h = new Hello();
        h.setName(name);
        return h;
    }

    @Getter
    @Setter
     static class Hello{

        private String name;
    }

}
