package com.example.pr13;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Student {
    @Value("${student.name}")
    private String name;

    @Value("${student.last_name}")
    private String lastName;

    @Value("${student.group}")
    private String group;

    @PostConstruct
    public void init() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "student.name=\"" + name + "\"\n" +
                "student.lastName=\"" + lastName + "\"\n" +
                "student.group=\"" + group + "\"";
    }
}
