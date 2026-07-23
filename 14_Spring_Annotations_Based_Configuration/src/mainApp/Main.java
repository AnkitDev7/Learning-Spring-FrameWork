package mainApp;

import myConfig.myConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(myConfiguration.class);
//        Employee emp = (Employee) ac.getBean("emp");
        Employee emp = ac.getBean(Employee.class);
        System.out.println(emp);
        emp.test();

        Employee emp2 = ac.getBean(Employee.class);
        System.out.println(emp2);
        emp2.test();

        ac.close();
    }
}