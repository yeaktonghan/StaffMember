package Staff;

public class Volunteer extends StaffMember {
    private double salary;

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public double getBonus() {
        return 0;
    }

    @Override
    public int getHourWorked() {
        return 0;
    }

    @Override
    public double getRate() {
        return 0;
    }

    public Volunteer(int id, String name, String address, double salary) {
        super(id, name, address);
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
        return;
    }

    @Override
    void setHourWorked(int hourWorked) {
        return;
    }

    @Override
    void setRate(double rate) {

    }
}
