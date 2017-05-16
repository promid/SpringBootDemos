package com.dbq.aop;

import org.springframework.stereotype.Service;

/**
 * Created by DBQ on 12/05/2017.
 */

@Service
public class DemoAnnotationService {

    @AopAction(name = "annotation interceptor")
    public void doSomething(){}

}
