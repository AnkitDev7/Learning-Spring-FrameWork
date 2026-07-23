package mainApp;

import java.util.Properties;

public class Employee {

    private String empName;
    private Properties properties;

    public Employee(){
        System.out.println("Employee Bean Instantiation");
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", properties=" + properties +
                '}';
    }
}
