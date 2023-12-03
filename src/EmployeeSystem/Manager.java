package EmployeeSystem;

public class Manager extends Employed implements Bonus{

    private String department;

    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    @Override
    public void Print() {
        System.out.println("I´m a manager in the department x");
    }


    @Override
    public double calculatorBonus(double porcentaje) {

        double bonus = porcentaje * getSalary();
        return bonus;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
