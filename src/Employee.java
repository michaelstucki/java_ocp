public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int dept;
    private double payRate;

    public Employee(String firstName, String lastName, int dept, double payRate) {
        setFirstName(firstName);
        setLastName(lastName);
        setDept(dept);
        setPayRate(payRate);
    }

    public Employee() {}

    public int getId() { return id; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getDept() { return dept; }

    public void setDept(int dept) { this.dept = dept; }

    public double getPayRate() { return payRate; }

    public void setPayRate(double payRate) { this.payRate = payRate; }

    public String getFullName() { return firstName + " " + lastName; }

    public String getPayInfo() {
        return "Employee " + id + " dept " + dept + " " + getFullName() + " paid " + payRate;
    }
}
