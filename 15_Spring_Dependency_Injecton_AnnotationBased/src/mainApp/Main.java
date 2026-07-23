package mainApp;

import myConfig.myConfigration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(myConfigration.class);
        Employee emp = ac.getBean(Employee.class);
        System.out.println(emp);
    }
}