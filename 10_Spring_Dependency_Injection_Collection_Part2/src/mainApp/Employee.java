package mainApp;
import java.util.Map;
import java.util.Set;

public class Employee {

    private String empId;
    private String empName;
    private Set<String> setList;

    public Employee(){
        System.out.println("Employee Initialilization......");
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Set<String> getSetList() {
        return setList;
    }

    public void setSetList(Set<String> setList) {
        this.setList = setList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", setList=" + setList +
                '}';
    }
}
