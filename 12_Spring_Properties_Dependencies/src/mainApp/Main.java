package mainApp;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Employee employee = (Employee) ac.getBean("employee");
        System.out.println(employee);
    }
}