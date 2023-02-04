package Staff;

public class HourlySalaryEmployee extends StaffMember {
    private int hourWorked;
    private double rate;


    public HourlySalaryEmployee(int id, String name, String address, int hourWorked, double rate) {
        super(id, name, address);
        this.hourWorked = hourWorked;
        this.rate = rate;
    }

    public int getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(int hourWorked) {
        this.hourWorked = hourWorked;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double pay() {
        return this.hourWorked*this.rate;
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
    public String toString() {
        return "ID: " + this.id + " Name: " + this.name + " Address: " + this.address + " Hour Worked: " + this.hourWorked + " Rate: " + this.rate;
    }
}
