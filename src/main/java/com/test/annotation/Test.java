package com.test.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException {
        //1.类加载器加载类
        Class child = Class.forName("com.test.annotation.Child");
        //2.判断是否含有标签
        boolean annotation = child.isAnnotationPresent(AnnotationFirst.class);
        //3.含有标签
        if (annotation) {
            //4.读取标签
            AnnotationFirst childAnnotation = (AnnotationFirst) child.getAnnotation(AnnotationFirst.class);
            System.out.println(childAnnotation.name());
        }
        //5.获取类的方法
        Method[] methods = child.getMethods();
        //6.循环遍历方法数组
        for (Method method : methods) {
            //7.判断方法上是否存在注解
            boolean annotationPresent = method.isAnnotationPresent(AnnotationFirst.class);
            if (annotationPresent) {
                //8.读取方法上的注解
                AnnotationFirst annotation1 = method.getAnnotation(AnnotationFirst.class);
                System.out.println(annotation1.name());
            }
        }

    }


}
