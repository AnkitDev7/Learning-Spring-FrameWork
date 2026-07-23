package myConfig;

import mainApp.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"mainApp"})
public class myConfiguration {

    @Bean(initMethod = "init" , destroyMethod = "destroy")
    public Employee getEmployee(){
        System.out.println("CUSTOM LOGIC...");
        return new Employee();
    }
}
