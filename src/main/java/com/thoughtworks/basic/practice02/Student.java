package com.thoughtworks.basic.practice02;

import com.thoughtworks.basic.practice01.Person;

/*
Student类是Person的子类，有name，age，还有classNumber(klass)属性。 有一个introduce方法， introduce方法返回一个字符串形如：

My name is Tom. I am 21 years old. I am a Student of Class 2.

Teacher类是Person的子类，有name，age属性，还有job属性。也有一个introduce方法， introduce方法返回一个字符串形如：

My name is Matt. I am 30 years old. I am a Teacher.

这两个类是一个类的扩展，但是他们有自己不同属性，也会有不同的方法。
 */
public class Student extends Person {
    private int klass;

    public String introduce(){
        return "My name is Tom. I am 21 years old. I am a Student of Class 2.";
    }
}
