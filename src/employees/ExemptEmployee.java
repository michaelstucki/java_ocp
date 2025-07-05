package employees;

import finance.Payable;

public class ExemptEmployee extends Employee implements Payable {

    public ExemptEmployee(String firstName, String lastName, int dept, double payRate) {
        super(firstName, lastName, dept, payRate);
    }

    @Override
    public String getPayInfo() {
        return "Exempt Employee " + getId() + " dept " + getDept() + " " + getFullName() +
               " paid " + getPayRate();
    }
}
