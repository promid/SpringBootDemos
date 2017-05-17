package com.dbq.bean;

/**
 * Created by DBQ on 2017/5/16.
 */
public class BeanWayService {

    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("@Bean-construct-method");
    }

    public void destroy(){
        System.out.println("@Bean-destroy-method");
    }

}
