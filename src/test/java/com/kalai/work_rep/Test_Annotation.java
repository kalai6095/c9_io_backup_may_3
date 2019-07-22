package com.kalai.work_rep;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Test_Annotation {
    String value() default "";
}
