package com.equator;

import com.equator.Equator;
import com.equator.FieldBaseEquator;
import com.equator.FieldInfo;
import com.equator.GetterBaseEquator;
import com.iq.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author: wangruitao
 * @DATE: 2019/12/26
 **/
public class EquatorTest {

    @Test
    public void fun(){
        Person p1 = new Person(1,"张三丰",101);
        Person p2 = new Person(2,"张三",102);
        Equator equator = new GetterBaseEquator();
        List<String> includeFields = new ArrayList<>();
        includeFields.add("name");
        List<String> excludeFields = new ArrayList<>();
        excludeFields.add("age");
//        List<FieldInfo> diffFields = equator.getDiffFields(p1, p2);
//        System.out.println(diffFields);

        Equator equator1 = new FieldBaseEquator(includeFields,null);
        List<FieldInfo> diffFields1 = equator1.getDiffFields(p1, p2);
        System.out.println(diffFields1);
    }
}
