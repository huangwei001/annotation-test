package com.test.annotation;

@AnnotationFirst(name = "测试父类标签", old = 78)
public class Person {

    String test1() {
        System.out.println("方法1");
        return null;
    }

    String test2() {
        System.out.println("方法2");
        return null;
    }
}
