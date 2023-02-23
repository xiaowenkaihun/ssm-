package com.itwen.spring.annotation;

import com.itwen.spring.annotation.impl.CalculatorImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 作者：小温小温今天开荤
 * 日期：2022/10/21 10:44
 * 文件描述：
 */
public class TestAop {
    @Test
    public void TestAopByAnnotation(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        int result = calculator.div(2, 1);
    }
}
