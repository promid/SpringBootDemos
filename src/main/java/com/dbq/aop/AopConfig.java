package com.dbq.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by DBQ on 12/05/2017.
 */
@Configuration
@ComponentScan("com.dbq.aop")
@EnableAspectJAutoProxy
public class AopConfig {

}
