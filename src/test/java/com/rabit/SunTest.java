package com.rabit;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.validation.*;
import javax.validation.metadata.ConstraintDescriptor;
import java.util.Iterator;
import java.util.Set;

public class SunTest {
    private static Validator validator;

    @BeforeClass
    public static void setUp(){
        ValidatorFactory factory= Validation.buildDefaultValidatorFactory();
        validator=factory.getValidator();
    }
    @Test
    public void idIsNull(){
        Sun sun=new Sun(1,1,null,"aaa",new Person1("qqqqqq",1,false));
        Set<ConstraintViolation<Sun>> constraintViolations=validator.validate(sun);
        System.out.println(constraintViolations.size());
       Iterator<ConstraintViolation<Sun>> iterator= constraintViolations.iterator();
        System.out.println("---------");
       while (iterator.hasNext()){
           System.out.println(iterator.next().getMessage());
       }
        System.out.println("----------");
        }
    }

