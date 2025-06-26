import employees.*;
import util.*;

import java.security.Key;

public class Payroll {
    public static void main(String[] args) {
        Employee e;
        String fName, lName;
        int dept;
        double payRate;

        for (int i = 0; i < 3; i++) {
            fName = KeyboardReader.getPromptedString("Enter first name: ");
            lName = KeyboardReader.getPromptedString("Enter last name: ");
            do {
                dept = KeyboardReader.getPromptedInt("Enter department: ");
                if (dept <= 0) System.out.println("Department must be >= 0");
            } while (dept <= 0);
            do {
                payRate = KeyboardReader.getPromptedDouble("Enter pay rate: ");
                if (payRate < 0.0) System.out.println("Pay rate must be > 0.0");
            } while (payRate < 0.0);
            e = new Employee(fName, lName, dept, payRate);
            System.out.println(e.getPayInfo());
        }
    }
}
