package mainApp;

import java.util.Map;

public class Employee {

    private String name;
    private String salary;
    private Map<String,String> mapList;

    public Employee(){
        System.out.println("Constructor Calling");
    }
    public Map<String, String> getMapList() {
        return mapList;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMapList(Map<String, String> mapList) {
        this.mapList = mapList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", mapList=" + mapList +
                '}';
    }
}
