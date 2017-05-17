package com.dbq.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by DBQ on 2017/5/16.
 */
public class JSR250WayService {

    @PostConstruct // 构造方法后执行
    public void init(){
        System.out.println("@JSR250-init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("@JSR250-construct-method");
    }

    @PreDestroy // Bean销毁之前执行
    public void destroy(){
        System.out.println("@JSR250-destroy-method");
    }
    
}
