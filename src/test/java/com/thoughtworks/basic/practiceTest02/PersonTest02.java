package com.thoughtworks.basic.practiceTest02;

import com.thoughtworks.basic.practice01.Person;
import com.thoughtworks.basic.practice02.Student;
import com.thoughtworks.basic.practice02.Teacher;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest02 {
    @Test
    public void person01_should_return_string() {
        //given
        Person person=new Person();

        //when
        String actual = person.introduce();

        //then
        assertEquals(actual,"My name is Tom. I am 21 years old.");
    }
    @Test
    public void person02_should_return_student_string() {
        //given
        Student st=new Student();

        //when
        String actual = st.introduce();

        //then
        assertEquals(actual,"My name is Tom. I am 21 years old. I am a Student of Class 2.");
    }
    @Test
    public void person02_should_return_teacher_string() {
        //given
        Teacher th=new Teacher();

        //when
        String actual = th.introduce();

        //then
        assertEquals(actual,"My name is Matt. I am 30 years old. I am a Teacher.");
    }
}
