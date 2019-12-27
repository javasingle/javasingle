package com.single.singletest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.stream.Collectors;

@SpringBootTest
class SingleTestApplicationTests {

    @Test
    void contextLoads() {
    }


    @Test
    public  void  test1(){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("test");
        strings.add("test2");
        strings.add("test3");

        String s = strings.stream().collect(Collectors.joining(",")).toString();
        System.out.println(s);
    }

}
