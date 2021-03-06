package com.seeyoo.bd.annoation;

import java.lang.annotation.*;

@Target({ ElementType.TYPE, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Relevance {

	String name() default "";

	String field() default "";

}
