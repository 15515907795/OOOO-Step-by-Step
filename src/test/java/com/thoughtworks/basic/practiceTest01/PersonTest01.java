package com.thoughtworks.basic.practiceTest01;

import com.thoughtworks.basic.Dependency;
import com.thoughtworks.basic.HelloWorld;
import com.thoughtworks.basic.practice01.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest01 {
    @Test
    public void person01_should_return_string() {
        //given
        Person person=new Person("Tom",21);

        //when
        String actual = person.introduce();

        //then
        assertEquals(actual,"My name is Tom. I am 21 years old.");
    }
}
