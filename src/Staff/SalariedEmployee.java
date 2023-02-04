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

    @Override
    void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    void setHourWorked(int hourWorked) {
        return;
    }

    @Override
    void setRate(double rate) {
        return;
    }


    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public double getBonus() {
        return bonus;
    }

    @Override
    public int getHourWorked() {
        return 0;
    }

    @Override
    public double getRate() {
        return 0;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " Name: " + this.name + " Address: " + this.address + " Bonus: " + this.bonus;
    }
}
