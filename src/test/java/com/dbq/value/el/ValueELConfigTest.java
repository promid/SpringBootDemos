package com.dbq.value.el;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by DBQ on 2017/5/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ValueELConfigTest {

    @Autowired
    ValueELConfig valueELConfig;

    @Test
    public void test1() throws Exception {
        valueELConfig.outputResource();
    }
}