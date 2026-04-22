package Inheritance;

// Base class Employee
class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
    }
}

// Derived class Manager
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, int teamSize) {
        super(name, id);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size : " + teamSize);
    }
}

// Derived class Engineer
class Engineer extends Employee {
    private String specialization;

    public Engineer(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization : " + specialization);
    }
}

// MAIN CLASS (Entry Point)
public class main {
    public static void main(String[] args) {

        // Manager object
        Manager manager = new Manager("Jax", 101, 8);
        System.out.println("Manager Details");
        manager.displayDetails();

        System.out.println();

        // Engineer object
        Engineer engineer = new Engineer("William", 202, "Backend Developer");
        System.out.println("Engineer Details");
        engineer.displayDetails();
    }
}
