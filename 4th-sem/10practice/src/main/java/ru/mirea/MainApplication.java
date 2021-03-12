package ru.mirea;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.mirea.config.*;
import ru.mirea.components.*;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Junior dev1 = context.getBean(Junior.class);
        Middle dev2 = context.getBean(Middle.class);
        Senior dev3 = context.getBean(Senior.class);
        System.out.println(dev1.doCoding());
        System.out.println(dev2.doCoding());
        System.out.println(dev3.doCoding());
    }
}
