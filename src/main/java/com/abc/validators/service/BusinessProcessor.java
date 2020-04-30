package com.abc.validators.service;

import com.abc.validators.annotation.Valid;
import com.abc.validators.domain.Restriction;
import com.abc.validators.domain.Tuple;

public class BusinessProcessor {
    public void process(Tuple anObject) {
        Valid valid = anObject.getClass().getAnnotation(Valid.class);
        System.out.println(valid);
        if (valid != null) {
            Class restrictionClass =  valid.value();
            try {
                Restriction restriction = (Restriction) restrictionClass.newInstance();
                restriction.validate(anObject);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }

    }
}
