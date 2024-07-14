public class Employee {

    private String id;
    private String name;
    private double salary;

    public Employee()
    {
        this(null,null,0.0);
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getAnnualSalary()
    {
        return getSalary() * 12;
    }

    public double raisedSalary(int percent)
    {
        return this.salary += (this.salary * percent / 100);
    }

    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
