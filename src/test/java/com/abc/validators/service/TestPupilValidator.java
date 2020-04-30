package com.abc.validators.service;

import com.abc.validators.RuleBrokenException;
import com.abc.validators.domain.BusinessObject;
import org.junit.Test;

public class TestPupilValidator {

    @Test
    public void should_pass_if_type_is_pupil_is_10_year_old() {
        BusinessObject anObject = new BusinessObject(10);
        BusinessProcessor businessProcessor = new BusinessProcessor();
        businessProcessor.process(anObject);
    }


    @Test(expected = RuleBrokenException.class)
    public void should_trow_exception_if_type_is_pupil_is_15_year_old() {
        BusinessObject anObject = new BusinessObject(15);
        BusinessProcessor businessProcessor = new BusinessProcessor();
        businessProcessor.process(anObject);
    }
}
