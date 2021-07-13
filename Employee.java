
public class Employee {

    private int id;
    private int salary;

    public Employee(int id, int salary) {
        setId(id);
        setsalary(salary);
    }

    public Employee(int id) {
        this(id, 0);
    }

    private void setsalary(int salary) {
        if (salary <= 0)
            throw new IllegalArgumentException("Salary can't be 0 or negative.");

        this.salary = salary;
    }

    private void setId(int id) {
        if (id <= 0)
            throw new IllegalArgumentException("Id can't be 0 or negative.");

        this.id = id;
    }

    public void showDetails() {
        System.out.println("Employee Id: " + id);
        System.out.println("Emplyoee salary: " + salary);
    }
}
