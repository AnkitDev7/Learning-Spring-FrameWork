package mainApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext aplication = new ClassPathXmlApplicationContext("bean.xml");
        Employee emp = (Employee) aplication.getBean("emp");
        Manager man = (Manager) aplication.getBean("man");
        Student stu = (Student) aplication.getBean("stu");

        System.out.println(emp);
        System.out.println(man);
        System.out.println(stu);
        
        aplication.close();
    }
}