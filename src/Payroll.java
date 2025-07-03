import employees.*;
import util.*;

public class Payroll {
    public static void main(String[] args) {
        ExemptEmployee[] e = new ExemptEmployee[5];
        String fName, lName;
        int dept;
        double payRate, hours;

        // Exempt employee
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
        ExemptEmployee ee = new ExemptEmployee(fName, lName, dept, payRate);
        System.out.println(ee.getPayInfo());

        // Non-exempt employee
        fName = KeyboardReader.getPromptedString("Enter first name: ");
        lName = KeyboardReader.getPromptedString("Enter last name: ");
        do {
            dept = KeyboardReader.getPromptedInt("Enter department: ");
            if (dept <= 0) System.out.println("Department must be >= 0");
        } while (dept <= 0);
        do {
            payRate = KeyboardReader.getPromptedDouble("Enter pay rate: ");
            if (payRate < 0.0) System.out.println("Pay rate must be >= 0.0");
        } while (payRate < 0.0);
        do {
            hours = KeyboardReader.getPromptedDouble("Enter hours: ");
            if (hours < 0.0) System.out.println("Hours must be >= 0.0");
        } while (hours < 0.0);
        NonexemptEmployee ne = new NonexemptEmployee(fName, lName, dept, payRate, hours);
        System.out.println(ne.getPayInfo());

        // Contract employee
        fName = KeyboardReader.getPromptedString("Enter first name: ");
        lName = KeyboardReader.getPromptedString("Enter last name: ");
        do {
            dept = KeyboardReader.getPromptedInt("Enter department: ");
            if (dept <= 0) System.out.println("Department must be >= 0");
        } while (dept <= 0);
        do {
            payRate = KeyboardReader.getPromptedDouble("Enter pay rate: ");
            if (payRate < 0.0) System.out.println("Pay rate must be >= 0.0");
        } while (payRate < 0.0);
        do {
            hours = KeyboardReader.getPromptedDouble("Enter hours: ");
            if (hours < 0.0) System.out.println("Hours must be >= 0.0");
        } while (hours < 0.0);
        ContractEmployee ce = new ContractEmployee(fName, lName, dept, payRate, hours);
        System.out.println(ce.getPayInfo());
    }
}
