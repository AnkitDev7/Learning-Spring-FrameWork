package mainApp;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Launch {
    public static void main(String[] args){
        System.out.println("Jai Shri ram");

        ClassPathResource resource = new ClassPathResource("bean.xml");
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
        Employee emp =(Employee) xmlBeanFactory.getBean("emp");
        emp.test();
    }
}
