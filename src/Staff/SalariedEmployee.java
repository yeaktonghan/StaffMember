package Staff;

public class SalariedEmployee extends StaffMember {
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
    void setName(String name) {
        this.name = name;
    }

    @Override
    void setId(int id) {
        this.id = id;
    }

    @Override
    void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary(){
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " Name: " + this.name + " Address: " + this.address + " Bonus: " + this.bonus;
    }
}
