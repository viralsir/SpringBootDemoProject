package com.arhaminst.SpringBootDemoProject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//PathVariable
// home/viral
// @query String
// home? name="viral"&std=12



@RestController
public class MyController
{
    @RequestMapping("/")
    public String welcome(){
        return "<h1 style=color:red>hello from Spring Boot</h1>";
    }

    @RequestMapping("/home")
    public String home(){
        return "Home Page";
    }

    @RequestMapping("/aboutus")
    public String aboutus(){
        return "About us Page";
    }
    @RequestMapping("/contactus")
    public String Contactus(){
        return "Contact us Page";
    }
     // student/be/1/viral
    @RequestMapping("/home/{name}")
    public String customemessage(@PathVariable("name") String name)
    {
        return "welcome " + name;
    }

    @RequestMapping("/student")
    public String StudentInfo(@RequestParam("name") String name,@RequestParam("age") int Age,@RequestParam("std") String std)

    {
        return "Student Info : name :"+name +" age :"+ Age +" Std" +std ;
    }

}
