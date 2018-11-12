package com.lz_java.annoation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,ElementType.METHOD})
public @interface MyRequestMapping {
    String value() default "";
}
