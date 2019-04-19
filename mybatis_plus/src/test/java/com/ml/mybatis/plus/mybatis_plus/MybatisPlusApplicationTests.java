package com.ml.mybatis.plus.mybatis_plus;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ml.mybatis.plus.mybatis_plus.data.Student;
import com.ml.mybatis.plus.mybatis_plus.mapper.StuMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusApplicationTests {

    @Autowired
    private StuMapper stuMapper;

    @Test
    public void contextLoads() {
        List<Student> students = stuMapper.selectList(null);
        for (int i = 20; i<=41;i++){
            Student student = new Student();
            student.setStyAge(1+i);
            student.setStyName("李四"+i);
            student.insert();
        }
        System.out.println(students);

    }

    @Test
    public void test(){
      Student student = new Student();
      student.setId(1l);
      student.setStyName("张三");
      student.updateById();
    }

}
