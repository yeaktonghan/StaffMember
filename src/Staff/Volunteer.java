package Staff;

public class Volunteer extends StaffMember {
    private double salary;



    public Volunteer(int id, String name, String address, double salary) {
        super(id, name, address);
        this.salary = salary;
    }



    @Override
    void pay(double salary) {
        this.salary = salary;
    }
}
