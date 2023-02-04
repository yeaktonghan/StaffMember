package Staff;

public class HourlySalaryEmployee extends StaffMember {
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
        return;
    }

    @Override
    void setBonus(double bonus) {
        return;
    }

    @Override
    void setHourWorked(int hourWorked) {
        this.hourWorked = hourWorked;
    }

    @Override
    void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double getSalary() {
        return 0;
    }

    @Override
    public double getBonus() {
        return 0;
    }

    @Override
    public int getHourWorked() {
        return hourWorked;
    }

    @Override
    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " Name: " + this.name + " Address: " + this.address + " Hour Worked: " + this.hourWorked + " Rate: " + this.rate;
    }

}
