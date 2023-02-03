package Staff;

public class SalariedEmployee extends StaffMember{
    private double salary;
    private double bonus;



    public SalariedEmployee(int id, String name, String address, double bonus, double salary) {
        super(id, name, address);
        this.bonus = bonus;
        this.salary = salary;
    }


    @Override
    void pay(double salary) {
        this.salary = salary;
    }


    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " Name: " + this.name + " Address: " + this.address + " Bonus: " + this.bonus;
    }
}
