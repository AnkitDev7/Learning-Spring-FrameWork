package mainApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext aplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Manager manager = (Manager) aplicationContext.getBean("manager");
        String permision = manager.permision();

        if (permision.equals("Granted")){
            Student student = (Student) aplicationContext.getBean("student");
            Employee employee = (Employee) aplicationContext.getBean("employee");
            employee.start();
            student.test();
        }else {
            System.out.println("Your are not Authorized user to access Employee and Student");
        }
    }
}