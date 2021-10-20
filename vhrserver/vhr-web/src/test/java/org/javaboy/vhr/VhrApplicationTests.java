package org.javaboy.vhr;


import org.assertj.core.util.Lists;
import org.assertj.core.util.Strings;
import org.javaboy.vhr.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.stream.Collectors;


@RunWith(SpringRunner.class)
@SpringBootTest
public class VhrApplicationTests {

    @Test
    public void contextLoads() {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        System.out.println(squaresList);
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("org.javaboy.vhr.model.Menu");
        ClassLoader classLoader = clazz.getClassLoader();
        System.out.println(classLoader.getClass().getSimpleName());
    }

}
