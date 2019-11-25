package com.it.anno;

import com.it.aa.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author: wangruitao
 * @DATE: 2019/11/25
 **/
@Service("impl1")
public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> queryStudentAll() {
        List<Student> list = new ArrayList<>();
        list.add(new Student("zhangsan",23));
        list.add(new Student("lisi",24));

        return list;
    }
}
