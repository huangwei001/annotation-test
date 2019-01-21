package com.test.annotation;

import java.lang.annotation.*;

//准许注解的地方
@Target({ElementType.METHOD, ElementType.TYPE})
//注解分类
@Retention(RetentionPolicy.RUNTIME)
//子类是否继承
@Inherited
//生成javadoc文件时是否带有注解
@Documented
public @interface AnnotationFirst {

    String name();

    int old() default 18;

}
