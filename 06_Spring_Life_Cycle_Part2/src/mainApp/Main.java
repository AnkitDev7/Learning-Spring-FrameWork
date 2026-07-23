package mainApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext application =
                new ClassPathXmlApplicationContext("bean.xml");

        Employee employee = (Employee) application.getBean("emp");

        employee.start();
        application.close();
    }
}