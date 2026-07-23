package mainApp;

public class Student {

    static {
        System.out.println("Student BEAN Loading");
    }

    public Student(){
        System.out.println("Student Beann Instanfiated");
    }

    public void test(){
        System.out.println("Tested...");
    }
}
