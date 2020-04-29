package com.it.anno;

import com.it.aa.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @Description: TODO
 * @Author: wangruitao
 * @DATE: 2019/11/25
 **/
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "/application.xml")
public class StudentTest {
    @Autowired
    @Qualifier("impl1")
//    @Resource(name="reAnnoImpl")
    StudentServiceImpl studentServiceImpl;


    @Test
    public  void query(){
        List<Student> list = studentServiceImpl.queryStudentAll();
        System.out.println(list);
        System.out.println("---------------------");
        Class<? extends Class> aClass = ApplicationContext.class.getClass();
        Method[] methods = studentServiceImpl.getClass().getMethods();
        String name = studentServiceImpl.getClass().getName();
        Field[] fields = studentServiceImpl.getClass().getFields();
        for (int i=0;i<fields.length;i++) {//遍历
            System.out.println(fields[i].getName());
        }
        System.out.println(methods);

    }
}
