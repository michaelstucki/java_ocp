public class Payroll {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setDept(1);
        employee.setPayRate(100.0);

        System.out.println(employee.getPayInfo());
    }
}
