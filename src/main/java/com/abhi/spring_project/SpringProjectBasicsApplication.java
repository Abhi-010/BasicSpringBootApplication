package com.abhi.spring_project;

import com.abhi.spring_project.sortAlgorithm.BinarySearchImplementation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@ComponentScan
@Configuration
public class SpringProjectBasicsApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringProjectBasicsApplication.class);

    public static void main(String[] args) {
        try(var applicationContext = new AnnotationConfigApplicationContext(SpringProjectBasicsApplication.class)){
            var binarySearch = applicationContext.getBean(BinarySearchImplementation.class);

            logger.info("{} binarySearch ", binarySearch);
            //System.out.println(binarySearch);
            //System.out.println();

            int result = binarySearch.binarySearch(new int[]{1,2,3},3) ;
            System.out.println(result);
        }
    }

}
