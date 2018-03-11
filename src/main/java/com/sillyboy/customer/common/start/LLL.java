package com.sillyboy.customer.common.start;

import java.lang.annotation.*;

/**
 * Created by sillyboy on 2017/12/10
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LLL {
    /**
     * Whether lazy initialization should occur.
     */
    boolean value() default true;


}
