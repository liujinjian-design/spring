package com.ljj.ioc;

import com.ljj.ioc.chapter4.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        System.out.println(dataSource);

//
//        DateFoo dateFoo = (DateFoo) applicationContext.getBean("dateFoo");
//
//        System.out.println(dateFoo);

//        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("spring-context.xml"));
//        BeanPostProcessor beanPostProcessor = new BeanPostProcessorDemo();
//        xmlBeanFactory.addBeanPostProcessor(beanPostProcessor);
//        Demo demo = (Demo) xmlBeanFactory.getBean("demo");
//        System.out.println(demo.getClass());
//        System.out.println(xmlBeanFactory.);


    }
}
