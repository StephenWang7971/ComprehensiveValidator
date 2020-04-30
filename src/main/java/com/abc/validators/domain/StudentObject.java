package com.abc.validators.domain;

import com.abc.validators.annotation.Valid;

@Valid(Restriction.class)
public class StudentObject extends Tuple {

    private int age;

    public StudentObject(int age) {
        this.age = age;
    }

    public String getStudentType() {
        return "pupil";
    }

    public int getStudentAge() {
        return age;
    }
}
