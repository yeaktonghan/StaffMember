package Staff;

// class can't be instantiated
public abstract class StaffMember {
    protected int id;

    protected String name;
    protected String address;

//    abstract public double getSalary();

//    abstract public double getBonus();

//    abstract public int getHourWorked();

//    abstract public double getRate();

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public StaffMember(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " Name: " + this.name + " Address: " + this.address;
    }

    public double pay() {
        return 0;
    }

    abstract void setName(String name);

    abstract void setId(int id);

    abstract void setAddress(String address);


}
