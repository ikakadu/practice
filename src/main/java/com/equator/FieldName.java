package com.equator;

import com.iq.Person;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author: wangruitao
 * @DATE: 2019/12/26
 **/
public class FieldName {

    public static List<String> getFieldNameByAnno(Class<?> clazz){
        List<String> list = new ArrayList<>();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(NeedToCompare.class)) {
                list.add(field.getName());
            }
        }
        return list;
    }


    public static void main(String[] args) {
        List<String> fieldNameByAnno = getFieldNameByAnno(Person.class);
        System.out.println(fieldNameByAnno);
    }
}
