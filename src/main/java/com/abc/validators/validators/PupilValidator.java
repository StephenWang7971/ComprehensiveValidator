package com.abc.validators.validators;

import com.abc.validators.RuleBrokenException;
import com.abc.validators.domain.StudentObject;
import com.abc.validators.domain.Tuple;

public class PupilValidator extends Validator {

    public void validate(Tuple anObject) throws RuleBrokenException {
        StudentObject student = (StudentObject) anObject;
        if (student.getStudentAge() >= 12) {
            throw new RuleBrokenException("Pupil should be under age 12.");
        }
    }
}
