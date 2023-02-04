package Staff;

public class Volunteer extends StaffMember {
    private double salary;


    public double getSalary() {
        return salary;
    }

    public Volunteer(int id, String name, String address, double salary) {
        super(id, name, address);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    void pay(double salary) {

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
}
