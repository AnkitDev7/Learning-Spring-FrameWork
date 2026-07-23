package mainApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext("bean.xml");
        Employee employee1 = (Employee) application.getBean("employee");
        employee1.setTest(120);
        employee1.test();

        Employee employee2 = (Employee) application.getBean("employee");
        employee2.test();
    }
}