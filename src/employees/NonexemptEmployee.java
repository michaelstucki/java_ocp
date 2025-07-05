package employees;

import finance.Payable;

public class NonexemptEmployee extends Employee implements Payable {
    private double hours;

    public NonexemptEmployee(String firstName, String lastName, int dept, double payRate, double hours) {
        super(firstName, lastName, dept, payRate);
        setHours(hours);
    }

    public double getHours() { return hours; }
    public void setHours(double hours) { if (hours >= 0.0) this.hours = hours; }

    @Override
    public String getPayInfo() {
        return "Non-Exempt Employee " + getId() + " dept " + getDept() + " " + getFullName() +
               " paid " + getPayRate() * getHours();
    }
}
