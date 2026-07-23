package mainApp;

public class Employee {

    private int test;

    static {
        System.out.println("Employee Static Block started");
    }

    public Employee() {
        System.out.println("Employee Constructor Calling");
    }

    public void test(){
        System.out.println("Test method Calling.." + test);
    }

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }
}
