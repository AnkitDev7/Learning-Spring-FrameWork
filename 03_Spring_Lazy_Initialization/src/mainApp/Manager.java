package mainApp;

import java.util.Scanner;

public class Manager {

    static {
        System.out.println("Manager Bean Loading");
    }

    public Manager(){
        System.out.println("Manager Bean Instantatead");
    }

    public String permision(){
        System.out.println("MNG Tested....");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Key :- ");
        int key = scanner.nextInt();

        if (key == 11){
            return "Granted";
        }else {
            return "Not Granted";
        }
    }
}
