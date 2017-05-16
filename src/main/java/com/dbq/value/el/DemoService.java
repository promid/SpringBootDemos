package com.dbq.value.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by DBQ on 16/05/2017.
 */

@Service
public class DemoService {

    @Value("其他类的属性")  //注入普通字符串
    public String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
