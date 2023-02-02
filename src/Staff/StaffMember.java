package Staff;

// class can't be instantiated
public abstract class StaffMember {
    protected int id;
    protected String name;
    protected String address;

    public StaffMember(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " Name: " + this.name + " Address: " + this.address;
    }

    abstract void pay(double salary);
}
