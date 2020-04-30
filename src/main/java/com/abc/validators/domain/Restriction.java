package com.abc.validators.domain;

import com.abc.validators.validators.MiddleSchoolValidator;
import com.abc.validators.validators.PupilValidator;
import com.abc.validators.validators.Validator;

public class Restriction {

    public void validate(Tuple anObject) {
        System.out.println("1=" + anObject.getStudentType());
        System.out.println("2=" + Student.recognize(anObject.getStudentType()));
        System.out.println("3=" + Student.recognize(anObject.getStudentType()).getValidator());
        Student.recognize(anObject.getStudentType()).getValidator().validate(anObject);
    }

    public enum Student {
        PUPIL(PupilValidator.class),
        MIDDLE_SCHOOL(MiddleSchoolValidator.class);

        private Class<? extends Validator> validator;

        Student(Class<? extends Validator> validator) {
            this.validator = validator;
        }

        public static Student recognize(String studentType) {
            for (Student type : Student.values()) {
                if (type.name().equalsIgnoreCase(studentType)) {
                    System.out.println("matched:" + type);
                    return type;
                }
            }
            return null;
        }

        public Validator getValidator() {
            try {
                return validator.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
