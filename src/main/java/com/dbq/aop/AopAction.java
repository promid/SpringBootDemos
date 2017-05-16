package com.dbq.aop;

import java.lang.annotation.*;

/**
 * Created by DBQ on 12/05/2017.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AopAction {
    String name();
}
