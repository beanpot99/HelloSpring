package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class HelloController {

    @RequestMapping(value="hello", method={RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String helloQuery(@RequestParam String name){
        return "Hello, " + name + "!";
    }
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithParam(@PathVariable String name){
        return "Hello, " + name + "!";
    }

    @GetMapping("form")
    public String helloForm(){
        return "form";
    }


//    public static String createMessage(String n, String l){
//        String greeting = "";
//        if(l.equals("English")){
//            greeting="Hello!";
//        }
//        else if(l.equals("French")){
//            greeting="Bonjour!";
//        }
//        else if(l.equals("Chinese")){
//            greeting="Ni Hao!";
//        }
//        else if(l.equals("German")){
//            greeting="Guten tag!";
//        }
//        else if(l.equals("Spanish")){
//            greeting="Hola!";
//        }
//        return greeting + " " + n;
//    }
}
