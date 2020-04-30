package com.abc.validators.validators;

import com.abc.validators.RuleBrokenException;
import com.abc.validators.domain.Tuple;

public abstract class Validator {
    public abstract void validate(Tuple anObject) throws RuleBrokenException;
}
