package employees;

public class Employee {
    private static int nextId = 1;
    private int id = nextId++;

    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }
    public static int getNextId() { return nextId; }

    private String firstName;
    private String lastName;
    private int dept;
    private double payRate;

    /**
     *  default constructor
     */
    public Employee() {}

    /**
     * constructor
     * @param firstName: employee's first name
     * @param lastName: employee's last name
     */
    public Employee(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    /**
     * constructor
     * @param firstName: employee's first name
     * @param lastName: employee's last name
     * @param dept: employee's department number
     */
    public Employee(String firstName, String lastName, int dept) {
        this(firstName, lastName);
        setDept(dept);
    }

    /**
     * constructor
     * @param firstName: employee's first name
     * @param lastName: employee's last name
     * @param payRate: employee's hourly pay rate
     */
    public Employee(String firstName, String lastName, double payRate) {
        this(firstName, lastName);
        setPayRate(payRate);
    }

    /**
     * constructor
     * @param firstName: employee's first name
     * @param lastName: employee's last name
     * @param dept: employee's department number
     * @param payRate: employee's hourly pay rate
     */
    public Employee(String firstName, String lastName, int dept, double payRate) {
        this(firstName, lastName, dept);
        setPayRate(payRate);
    }

    /**
     *
     * @return employee's ID
     */
    public int getId() { return id; }

    /**
     *
     * @return employee's first name
     */
    public String getFirstName() { return firstName; }

    /**
     *
     * @param firstName: employee's first name
     */
    public void setFirstName(String firstName) { this.firstName = firstName; }

    /**
     *
     * @return employee's last name
     */
    public String getLastName() { return lastName; }

    /**
     *
     * @param lastName: employee's last name
     */
    public void setLastName(String lastName) { this.lastName = lastName; }

    /**
     *
     * @return employee's department number
     */
    public int getDept() { return dept; }

    /**
     *
     * @param dept: employee's department number
     */
    public void setDept(int dept) { this.dept = dept; }

    /**
     *
     * @return employee's hourly pay rate
     */
    public double getPayRate() { return payRate; }

    /**
     *
     * @param payRate: employee's hourly pay rate
     */
    public void setPayRate(double payRate) { this.payRate = payRate; }

    /**
     *
     * @return employee's full name
     */
    public String getFullName() { return firstName + " " + lastName; }

    /**
     *
     * @return employee pay information
     */
    public String getPayInfo() {
        return "employees.Employee " + id + " dept " + dept + " " + getFullName() + " paid " + payRate;
    }
}
