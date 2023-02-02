package Staff;

public class Volunteer extends StaffMember {
    private double salary;


    public Volunteer(int id, String name, String address) {
        super(id, name, address);
    }


    @Override
    void pay(double salary) {
        this.salary = salary;
    }
}
