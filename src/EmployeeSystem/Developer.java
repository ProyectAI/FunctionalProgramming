package EmployeeSystem;

public class Developer extends Employed implements Bonus{

    private String language;

    public Developer(String name, int age, double salary, String language) {
        super(name, age, salary);
        this.language = language;
    }

    @Override
    public void Print() {
        System.out.println("I´m a programmer in the language Java");
    }

    @Override
    public double calculatorBonus(double porcentaje) {
        double bonusP = porcentaje * getSalary();
        return bonusP;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
