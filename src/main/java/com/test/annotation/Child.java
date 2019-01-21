package com.test.annotation;

@AnnotationFirst(name = "测试子类标签", old = 17)
public class Child extends Person{

    @AnnotationFirst(name = "测试子类方法上的注解")
    public String test1() {
        System.out.println("方法1");
        return null;
    }

    public String test2() {
        System.out.println("方法2");
        return null;
    }




}
