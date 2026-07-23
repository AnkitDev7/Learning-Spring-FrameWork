package myConfig;

import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = {"mainApp"})
@PropertySource("classpath:config.properties")
public class myConfigration {

    @Bean("list1")
    @Primary
    public List<String> getList1(){
        List<String> list = Arrays.asList("ankit1", "mishra1", "dubey ji1");
        return list;
    }

    @Bean("list2")
    public List<String> getList2(){
        List<String> list = Arrays.asList("ankit 2", "mishra 2", "dubey ji 2");
        return list;
    }

    @Bean("list3")
    public List<String> getList3(){
        List<String> list = Arrays.asList("ankit 3", "mishra 3", "dubey ji 3");
        return list;
    }

}
