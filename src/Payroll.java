import employees.*;
import util.*;

public class Payroll {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        // Get employees
        for (int i = 0; i < employees.length; i++) {
            // Get employee type
            Employee e = null;
            char type;
            boolean validType = false;
            do {
                type = KeyboardReader.getPromptedChar("Enter employee type: E[xempt], N[onexempt], C[ontract]");
                validType = type == 'E' || type == 'e' ||
                            type == 'N' || type == 'n' ||
                            type == 'C' || type == 'c';
                if (!validType) System.out.println("Invalid employee type");
            } while (!validType);

            // Get employee name
            String fName = KeyboardReader.getPromptedString("Enter first name: ");
            String lName = KeyboardReader.getPromptedString("Enter last name: ");

            // Get employee department
            int dept;
            do {
                dept = KeyboardReader.getPromptedInt("Enter department: ");
                if (dept <= 0) System.out.println("Department must be > 0");
            } while (dept <= 0);

            // Get employee pay rate
            double payRate;
            do {
                payRate = KeyboardReader.getPromptedDouble("Enter pay rate: ");
                if (payRate <= 0.0) System.out.println("Pay rate must be > 0.0");
            } while (payRate <= 0.0);

            // Create employee instances (nonexempt and contract need hours)
            double hours;
            switch (type) {
                case 'E', 'e':
                    e = new ExemptEmployee(fName, lName, dept, payRate);
                    break;
                case 'N', 'n':
                    hours = getHours();
                    e = new NonexemptEmployee(fName, lName, dept, payRate, hours);
                    break;
                case 'C', 'c':
                    hours = getHours();
                    e = new ContractEmployee(fName, lName, dept, payRate, hours);
                    break;
                default:
            }
            employees[i] = e;
        }

        // Print employees by employee type
        StringBuilder sbE = new StringBuilder();
        StringBuilder sbN = new StringBuilder();
        StringBuilder sbC = new StringBuilder();


        for (Employee e : employees) {
            if (e instanceof ExemptEmployee) sbE.append(e.getPayInfo()).append("\n");
            else if (e instanceof NonexemptEmployee) sbN.append(e.getPayInfo()).append("\n");
            else if (e instanceof ContractEmployee) sbC.append(e.getPayInfo()).append("\n");
        }
        System.out.println("Exempt Employees");
        System.out.println("----------------");
        System.out.println(sbE.toString());

        System.out.println("Non-Exempt Employees");
        System.out.println("----------------");
        System.out.println(sbN.toString());

        System.out.println("Contract Employees");
        System.out.println("----------------");
        System.out.println(sbC.toString());
    }

    public static double getHours() {
        double hours = 0;
        do {
            hours = KeyboardReader.getPromptedDouble("Enter hours: ");
            if (hours < 0.0) System.out.println("Hours must be >= 0.0");
        } while (hours < 0.0);
        return hours;
    }
}
