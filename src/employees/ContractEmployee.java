package employees;

public class ContractEmployee extends Employee {
    private double hours;

    public ContractEmployee(String firstName, String lastName, int dept, double payRate, double hours) {
        super(firstName, lastName, dept, payRate);
        setHours(hours);
    }

    public double getHours() { return hours; }
    public void setHours(double hours) { if (hours >= 0.0) this.hours = hours; }

    @Override
    public String getPayInfo() {
        return "Contract Employee " + getId() + " dept " + getDept() + " " + getFullName() +
               " paid " + getPayRate() * getHours();
    }
}
