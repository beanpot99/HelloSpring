package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {
    @RequestMapping(method={RequestMethod.GET,RequestMethod.POST})
    public String languageDropdown(){
        return "<html>"+
                "<body>"+
                "<form action='/hello' method='post'>"+
                "<input type = 'text' name ='name'>"+
                "<select id='languages' name='languages>"+
                "<option value ='French'>French</option>"+
                "<option value ='English'>English</option>"+
                "<option value ='Spanish'>Spanish</option>"+
                "<option value ='Chinese'>Chinese</option>"+
                "<option value ='German'>German</option>"+
                "</select>"+
                "<button type='submit'>Greet Me!</button>"+
                "</form>"+
                "</body>"+
                "</html>";
    }

    @GetMapping("{name}")
    public String helloWithParam(@PathVariable String name){
        return "Hello, " + name + "!";
    }
    @RequestMapping(method={RequestMethod.GET,RequestMethod.POST})
    public String helloQuery(@RequestParam String name){
        return "Hello, " + name + "!";
    }
    @RequestMapping(value="hello", method= RequestMethod.POST)
    public String helloPost(@RequestParam String name, @RequestParam String language){
        if(name==null){
            name="World";
        }
        return createMessage(name, language);
    }
    public static String createMessage(String n, String l){
        String greeting = "";
        if(l.equals("English")){
            greeting="Hello!";
        }
        else if(l.equals("French")){
            greeting="Bonjour!";
        }
        else if(l.equals("Chinese")){
            greeting="Ni Hao!";
        }
        else if(l.equals("German")){
            greeting="Guten tag!";
        }
        else if(l.equals("Spanish")){
            greeting="Hola!";
        }
        return greeting + " " + n;
    }
}
