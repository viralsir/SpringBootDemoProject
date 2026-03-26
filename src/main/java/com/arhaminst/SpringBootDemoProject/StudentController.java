package com.arhaminst.SpringBootDemoProject;

import com.arhaminst.SpringBootDemoProject.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RequestMapping("/student")
@RestController
public class StudentController
{
    //static Student student=new Student();
    static ArrayList<Student> studenlist=new ArrayList<>();

    @RequestMapping("/add")
    public String add(@RequestParam("rollno")int rollno,@RequestParam("name") String name,@RequestParam("maths") int maths,@RequestParam("science")int science,@RequestParam("english")int english,@RequestParam("hindi") int hindi){

           studenlist.add(new Student(rollno, name, maths, science, english, hindi));

//         student.setRollno(rollno);
//         student.setName(name);
//         student.setMaths(maths);
//         student.setScience(science);
//         student.setEnglish(english);
//         student.setHindi(hindi);

         return "Record has been saved successfully";
    }

    @RequestMapping("/view/{rollno}")
    public Student view(@PathVariable("rollno")int rollno){
        for (Student student:studenlist)
        {
            if(student.getRollno()==rollno)
            {
                return student;
            }
        }
        return null;
    }

    @RequestMapping("/view")
    public ArrayList<Student> viewall(){
        return studenlist;
    }


}
