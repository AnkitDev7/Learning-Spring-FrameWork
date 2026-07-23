package mainApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext acc = new ClassPathXmlApplicationContext("bean.xml");
        Employee employee = (Employee) acc.getBean("employee");
        System.out.println(employee);
        System.out.println(employee.getListofBook().getClass());
    }
}