public class employee {
    private String name;
    private int salary; 
    public employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        } else {
            System.out.println("Invalid salary");
        }
    }
    public void display() {
        System.out.println("Employee Name: " + name + ", Salary: " + salary);
    }
    public static void main(String[] args) {
        employee emp = new employee("John Doe", 50000);
        emp.display();
        emp.setSalary(60000);
        emp.display();
        emp.setSalary(-1000);
    }
}