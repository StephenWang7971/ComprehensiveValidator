package com.abc.validators.service;

import com.abc.validators.RuleBrokenException;
import com.abc.validators.domain.StudentObject;
import org.junit.Test;

public class TestPupilValidator {

    @Test
    public void should_pass_if_type_is_pupil_and_10_year_old() {
        StudentObject anObject = new StudentObject(10);
        BusinessProcessor businessProcessor = new BusinessProcessor();
        businessProcessor.process(anObject);
    }


    @Test(expected = RuleBrokenException.class)
    public void should_trow_exception_if_type_is_pupil_and_15_year_old() {
        StudentObject anObject = new StudentObject(15);
        BusinessProcessor businessProcessor = new BusinessProcessor();
        businessProcessor.process(anObject);
    }
}
