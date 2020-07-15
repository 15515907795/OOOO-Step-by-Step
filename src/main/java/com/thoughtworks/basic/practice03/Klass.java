package com.thoughtworks.basic.practice03;

import java.util.ArrayList;
import java.util.List;

/*
一个班级有多个学生，一个班级会分配一个老师。

Student的class属性不是一个数字，而是一个对象。
 */
public class Klass {
    private int number;
    private Teacher teacher;
    List<Student> students = new ArrayList<Student>();

    public Klass(int number) {
        this.number = number;
    }

    public Klass(int number, Teacher teacher) {
        this.number = number;
        this.teacher = teacher;
    }

    public int getNumber() {

        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Teacher getTeacher() {

        return teacher;
    }

    public void setTeacher(Teacher teacher) {

        this.teacher = teacher;
    }

    public List<Student> getStudents() {

        return students;
    }

    public void setStudents(List<Student> students) {

        this.students = students;
    }

    public Klass(int number, Teacher teacher, List<Student> students) {
        this.number = number;
        this.teacher = teacher;
        this.students = students;
    }
}
