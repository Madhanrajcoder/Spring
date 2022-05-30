package com.example.main;

import com.example.Bean.Vechile;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[]args){
        Vechile vechile=new Vechile();
        vechile.setName("Honda city");
        System.out.println("Vehicle name from non-spring context is: "+vechile.getName());

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vechile veh=context.getBean(Vechile.class);
        System.out.println("Vehicle name from spring context is: "+vechile.getName());

        String hello= context.getBean(String.class);
        System.out.println(hello);
        int number;
        number = context.getBean(Integer.class);
        System.out.println(number);



    }
}
