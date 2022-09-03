package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var p = context.getBean(Parrot.class);
        System.out.println(p.getName());

        var s = context.getBean(String.class);
        System.out.println(s);

        var n = context.getBean(Integer.class);
        System.out.println(n);
    }
}
