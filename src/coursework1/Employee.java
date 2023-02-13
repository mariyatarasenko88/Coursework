package coursework1;

public class Employee {
    private String fullName;
    private int department;
    private double salary;
    private static int counter;
    private int id;

    public Employee (String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = ++counter;
    }
    public String getFullName() {
        return fullName;
    }
    public int getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Id " + id + " Ф.И.О. " + this.fullName + " Отдел " + this.department + " Зарплата " + this.salary;
    }


    }
