package com.seeyoo.bd.annoation;

import java.lang.annotation.*;

@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RelevanceClass {

	String value() default "";

}
