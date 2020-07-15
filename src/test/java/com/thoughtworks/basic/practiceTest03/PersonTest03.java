package com.thoughtworks.basic.practiceTest03;

import com.thoughtworks.basic.practice01.Person;
import com.thoughtworks.basic.practice03.Klass;
import com.thoughtworks.basic.practice03.Student;
import com.thoughtworks.basic.practice03.Teacher;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest03 {
    @Test
    public void person03_should_return_string() {
        //given
        Person person = new Person("Tom", 21);

        //when
        String actual = person.introduce();

        //then
        assertEquals(actual, "My name is Tom. I am 21 years old.");
    }

    @Test
    public void students_and_teacher_in_klass2_should_recive_message_when_changeName() {
        //given klass 2，老师1，学生1，2，3
        Teacher teacher = new Teacher("Tony", 31);

        Klass klass1 = new Klass(1, teacher);
        Student st1 = new Student("LittleTom", 21, klass1);
        Student st2 = new Student("Jerry", 19, klass1);
        Student st3 = new Student("Speike", 18, klass1);
        klass1.getStudents().add(st1);
        klass1.getStudents().add(st2);
        klass1.getStudents().add(st3);
        //when学生1改名字
        st1.changeName("Tom");
        //then学生2，3以及老师都收到消息
        String teachermessage = teacher.getMessage();
        String st2message = st2.getMessage();
        String st3message = st3.getMessage();
        assertEquals(teachermessage, "My name is Tom. I am 21 years old. I am a student of Class 1 now.");
        assertEquals(st2message, "My name is Tom. I am 21 years old. I am a student of Class 1 now.");
        assertEquals(st3message, "My name is Tom. I am 21 years old. I am a student of Class 1 now.");

    }

    @Test
    public void students_and_teacher_in_klass2_and_klass1_should_recive_message_when_changeName() {
        //given klass 1，老师1，学生1，2
        //given klass 2，老师2，学生3，4
        Teacher teacher1 = new Teacher("Tony", 31);
        Teacher teacher2 = new Teacher("Matt", 35);

        Klass klass1 = new Klass(1, teacher1);
        Student st1 = new Student("Tom", 21, klass1);
        Student st2 = new Student("Jerry", 19, klass1);
        klass1.getStudents().add(st1);
        klass1.getStudents().add(st2);
        Klass klass2 = new Klass(2, teacher2);
        Student st3 = new Student("Marry", 21, klass2);
        Student st4 = new Student("Lisa", 19, klass2);
        klass2.getStudents().add(st3);
        klass2.getStudents().add(st4);
        //when学生1调班级，从1班调到2班
        st1.changeKlass(klass2);

        //then学生1不应该在班级1里面
        //then老班级学生2、老师1以及新班级学生3、4老师2都收到消息
        boolean reslut=klass1.getStudents().contains(st1);
        assertEquals(false, reslut);

        String teacher1Message = teacher1.getMessage();
        String teacher2Message = teacher2.getMessage();

        String st2message = st2.getMessage();
        String st3message = st3.getMessage();
        assertEquals(teacher1Message, "My name is Tom. I am 21 years old. I am a student of Class 2 now.");
        assertEquals(teacher2Message, "My name is Tom. I am 21 years old. I am a student of Class 2 now.");
        assertEquals(st2message, "My name is Tom. I am 21 years old. I am a student of Class 2 now.");
        assertEquals(st3message, "My name is Tom. I am 21 years old. I am a student of Class 2 now.");
    }
    @Test
    public void students_and_teacher_in_klass2_and_klass1_should_recive_message_when_changeName_and_changeklass() {
        //given klass 1，老师1，学生1，2
        //given klass 2，老师2，学生3，4
        Teacher teacher1 = new Teacher("Tony", 31);
        Teacher teacher2 = new Teacher("Matt", 35);

        Klass klass1 = new Klass(1, teacher1);
        Student st1 = new Student("LittleTom", 21, klass1);
        Student st2 = new Student("Jerry", 19, klass1);
        klass1.getStudents().add(st1);
        klass1.getStudents().add(st2);
        Klass klass2 = new Klass(2, teacher2);
        Student st3 = new Student("Marry", 21, klass2);
        klass2.getStudents().add(st3);
        //when学生1改了名字，调班级，从1班调到2班
        st1.changeName("Tom");
        st1.changeKlass(klass2);

        //then学生1不应该在班级1里面
        //then老班级学生2、老师1以及新班级学生3、4老师2都收到消息
        boolean reslut=klass1.getStudents().contains(st1);
        assertEquals(false, reslut);

        String teacher1Message = teacher1.getMessage();
        String teacher2Message = teacher2.getMessage();

        String st2message = st2.getMessage();
        String st3message = st3.getMessage();
        assertEquals(teacher1Message, "My name is Tom. I am 21 years old. I am a student of Class 2 now.");
        assertEquals(teacher2Message, "My name is Tom. I am 21 years old. I am a student of Class 2 now.");
        assertEquals(st2message, "My name is Tom. I am 21 years old. I am a student of Class 2 now.");
        assertEquals(st3message, "My name is Tom. I am 21 years old. I am a student of Class 2 now.");
    }

}
