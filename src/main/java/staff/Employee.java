package staff;

public abstract class Employee {
    private String name;
    private String nationalInsurance;
    protected double salary;

    public Employee(String name, String nationalInsurance, double salary) {
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNationalInsurance() {
        return nationalInsurance;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double raise) {
        if(raise > 0) {
            salary += raise;
        }
        return salary;
    }

    public double payBonus() {
        return salary*0.01;
    }

    public String setName(String newName) {
        if(newName != null) {
            this.name = newName;
        }
        return name;
    }
}
