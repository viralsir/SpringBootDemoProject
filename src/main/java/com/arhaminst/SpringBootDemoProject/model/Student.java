package com.arhaminst.SpringBootDemoProject.model;

public class Student
{
    private int rollno;
    private String name;
    private int maths,science,english,hindi;

    public int getHindi() {
        return hindi;
    }

    public void setHindi(int hindi) {
        this.hindi = hindi;
    }

    public Student() {
    }

    public Student(int rollno, String name, int maths, int science, int english,int hindi) {
        this.rollno = rollno;
        this.name = name;
        this.maths = maths;
        this.science = science;
        this.english = english;
        this.hindi=hindi;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
}
