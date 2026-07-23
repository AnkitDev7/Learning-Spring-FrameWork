package mainApp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

public class BeanPostProcessorImpl implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization");

        if (bean instanceof Employee){
            System.out.println("Employee Specific Work...... Ex password Decrypt");
        } else if (bean instanceof Manager) {
            Manager manager = (Manager) bean;
            System.out.println("Bean is Property Instantiated and Dependency are Injection for the Bean"+beanName);
            System.out.println(manager);
        }

        return bean;
    }

    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization");

        if (bean instanceof Employee){
            System.out.println("Employee VALIDATE SUCESSFULLY");
        } else if (bean instanceof Manager) {
            System.out.println("MANAGER CONNECTION POOL MOODIFIED");
        }
        return bean;
    }

}
