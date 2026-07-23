package mainApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext aplication = new ClassPathXmlApplicationContext("bean.xml");
        aplication.close();
    }
}