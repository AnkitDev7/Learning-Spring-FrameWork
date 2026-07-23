package myApp;

import java.util.List;

public class Employee {

    private String empId;
    private Car car;
    private Account accout;
    private List<String> lostofBook;

    public Employee(){
        System.out.println("Employee Bean Instantiation");
    }

    public Employee(Account accout, Car car, List<String> lostofBook) {
        this.accout = accout;
        this.car = car;
        this.lostofBook = lostofBook;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Account getAccout() {
        return accout;
    }

    public void setAccout(Account accout) {
        this.accout = accout;
    }

    public List<String> getLostofBook() {
        return lostofBook;
    }

    public void setLostofBook(List<String> lostofBook) {
        this.lostofBook = lostofBook;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", car=" + car +
                ", accout=" + accout +
                ", lostofBook=" + lostofBook +
                '}';
    }
}
