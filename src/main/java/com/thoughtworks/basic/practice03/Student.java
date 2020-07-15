package com.thoughtworks.basic.practice03;

import com.thoughtworks.basic.practice01.Person;

import java.util.List;

/*
一个班级有多个学生，一个班级会分配一个老师。

Student的class属性不是一个数字，而是一个对象。
 */
public class Student extends Person {

    private Klass klass;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(String name, int age, Klass klass) {
        super(name,age);
        this.klass = klass;
    }

    public String introduce() {
        return "My name is " + getName() + ". I am " + getAge() + " years old. I am a Student of Class " + getKlass() + ".";
    }

    public void changeName(String name) {
        setName(name);
        String message = "My name is " + getName() + ". I am " + getAge() + " years old. I am a student of Class " + getKlass().getNumber()+ " now.";
        getKlass().getTeacher().setMessage(message);
        List<Student> students = getKlass().getStudents();

        for (Student st : students) {
            st.setMessage(message);
        }
    }
    public void changeKlass(Klass klass) {
        Klass formerklass=this.klass;
        this.klass=klass;

        String message = "My name is " + getName() + ". I am " + getAge() + " years old. I am a student of Class " + getKlass().getNumber()+ " now.";
        formerklass.getTeacher().setMessage(message);
        formerklass.students.remove(this);
        List<Student> formerklassStudents = formerklass.getStudents();
        for (Student st : formerklassStudents) {
            st.setMessage(message);
        }

        getKlass().getTeacher().setMessage(message);
        List<Student> students = getKlass().getStudents();
        for (Student st : students) {
            st.setMessage(message);
        }
    }

}
