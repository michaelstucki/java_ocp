import employees.*;
import util.*;

import java.security.Key;

public class Payroll {
    public static void main(String[] args) {
        Employee.setNextId(22);

        Employee e1 = new Employee();
        e1.setFirstName("John");
        e1.setLastName("Doe");
        e1.setDept(2);
        e1.setPayRate(6000.0);
        System.out.println(e1.getPayInfo());

        Employee e2 = new Employee("Jane", "Smith", 15, 6500.0);
        System.out.println(e2.getPayInfo());

        Employee e3 = new Employee("Bob", "Jones", 5400.0);
        System.out.println(e3.getPayInfo());

        Employee e4 = new Employee("Bill", "Meelater", 4);
        System.out.println(e4.getPayInfo());

        String fName = KeyboardReader.getPromptedString("Enter first name: ");
        String lName = KeyboardReader.getPromptedString("Enter last name: ");

        int dept = KeyboardReader.getPromptedInt("Enter department: ");
        if (dept <= 0) {
            System.out.println("department must be a positive integral!");
            dept = 0;
        }

        double payRate = KeyboardReader.getPromptedDouble("Enter pay rate: ");
        if (payRate < 0) {
            System.out.println("pay rate must be greater than zero!");
            payRate = 0;
        }

        Employee e5 = new Employee(fName, lName, dept, payRate);
        System.out.println(e5.getPayInfo());


    }
}
