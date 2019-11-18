package com.iq;

import java.lang.reflect.Field;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestParam;

public class Test5 {
	public static void main( String args[]) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(getArrayListCapacity(arrayList));
 
        //增加元素，使其扩容
        arrayList.add(0);
        System.out.println(Test4.getArrayListCapacityMy(arrayList));
 
        for(int i = 0; i < 9; ++i)
            arrayList.add(i);
        System.out.println(getArrayListCapacity(arrayList));
 
//        for(int i = 0; i < 5; ++i)
//            arrayList.add(0);
//        System.out.println(getArrayListCapacity(arrayList));
//        
//        for(int i = 0; i < 10; ++i)
//            arrayList.add(0);
//        System.out.println(getArrayListCapacity(arrayList));
    }
 
    public static int getArrayListCapacity(ArrayList<?> arrayList) {
        Class<ArrayList> arrayListClass = ArrayList.class;
        try {
            Field field = arrayListClass.getDeclaredField("elementData");
            field.setAccessible(true);
            Object[] objects = (Object[])field.get(arrayList);
           return objects.length;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return -1;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return -1;
        }
    }

}
