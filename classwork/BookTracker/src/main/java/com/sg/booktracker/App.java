package com.sg.booktracker;

import com.sg.booktracker.controller.BookController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Kyle David Rudy
 */
public class App {

    public static void main(String[] args) {
        // XML configuration method (see applicationContext.xml in src/main/resources)
        /*
        ApplicationContext appContext
                = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        BookController controller = appContext.getBean("controller", BookController.class);
        */
        
        // Annotation method
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
        appContext.scan("com.sg.booktracker");
        appContext.refresh();
        
        // note that first argument passedd to .getBean6 is camel case, this is by default (as opposed to XML config where it is the id property)
        BookController controller = appContext.getBean("bookController", BookController.class);
        controller.run();
        
    }
}
