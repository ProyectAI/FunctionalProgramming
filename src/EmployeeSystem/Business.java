package EmployeeSystem;

public class Business {
    public static void main(String[]args){
        Manager manager = new Manager("Cesar", 23, 1200.0,"Idat");
        Developer developer = new Developer("Miguel", 23, 1500.0, "Java");

        manager.Print();
        System.out.println("The bonus for a manager is:" +manager.calculatorBonus((15.0/100.0)));
        developer.Print();
        System.out.println("The bonus for a developer is:" + developer.calculatorBonus( (10.0/100.0)));


    }
}
