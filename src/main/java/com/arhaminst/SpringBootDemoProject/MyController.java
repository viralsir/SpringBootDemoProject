package com.arhaminst.SpringBootDemoProject;

import com.arhaminst.SpringBootDemoProject.model.Student;
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

//    @RequestMapping("/student")
//    public String StudentInfo(@RequestParam("name") String name,@RequestParam("age") int Age,@RequestParam("std") String std)
//
//    {
//        return "Student Info : name :"+name +" age :"+ Age +" Std" +std ;
//    }

//    @RequestMapping("/student")
//    public Student studentinfo(@RequestParam("rollno")int rollno,@RequestParam("name") String name,@RequestParam("maths") int maths,@RequestParam("science")int science,@RequestParam("english")int english,@RequestParam("hindi") int hindi)
//    {
//         Student student=new Student(rollno,name,maths,science,english,hindi);
//         return student;
//    }



}
