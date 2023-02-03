package Staff;

public class HourlySalaryEmployee extends StaffMember{
    private int hourWorked;
    private double rate;


    public HourlySalaryEmployee(int id, String name, String address, int hourWorked, double rate) {
        super(id, name, address);
        this.hourWorked = hourWorked;
        this.rate = rate;
    }

    @Override
    void pay(double salary) {

    }

    @Override
    public String toString() {
        return "ID: " + this.id + " Name: " + this.name + " Address: " + this.address + " Hour Worked: " + this.hourWorked + " Rate: " + this.rate;
    }
}
