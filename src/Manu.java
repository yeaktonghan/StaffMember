import Staff.HourlySalaryEmployee;
import Staff.SalariedEmployee;
import Staff.StaffMember;
import Staff.Volunteer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Manu {

    static int currentIdIndex = 4;

    static ArrayList<StaffMember> staffMembers = new ArrayList<>();

    public static void initData() {
        Volunteer volunteer = new Volunteer(1, "Demo Staff 1", "Phnom Penh", 120);
        staffMembers.add(volunteer);
        SalariedEmployee salariedEmployee = new SalariedEmployee(2, "Demo Staff 2", "Kandal", 20, 200);
        staffMembers.add(salariedEmployee);
        HourlySalaryEmployee hourlySalaryEmployee = new HourlySalaryEmployee(3, "Demo Staff 3", "KPS", 40, 5);
        staffMembers.add(hourlySalaryEmployee);
    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("==================== Staff Member ====================");
                System.out.println("1) Insert employee");
                System.out.println("2) Update employee");
                System.out.println("3) Display employee");
                System.out.println("4) Remove employee");
                System.out.println("5) Exit");
                System.out.print("=> Please choose your action: ");
                int input = scanner.nextInt();
                scanner.nextLine();
                if (input >= 1 && input <= 5) {
                    switch (input) {
                        case 1 -> insertEmployee();
                        case 2 -> updateEmployee();
                        case 3 -> displayEmployee();
                        case 4 -> removeEmployee();
                        case 5 -> exit();
                    }
                } else {
                    System.out.println("Please only enter number between 1 <=> 5: !!!");
//                    mainMenu();
                }
            } catch (InputMismatchException ime) {
                System.out.println("Please only enter number between 1 <=> 5 !!!");
//                mainMenu();
            }
        }
    }

    public static void insertEmployee() {
        Scanner scanner = new Scanner(System.in);

        outer_while_loop:
        while (true) {
            try {
                System.out.println("==================== Insert Employee ====================");
                System.out.println("1) Volunteer");
                System.out.println("2) Salary Employee");
                System.out.println("3) Hourly Employee");
                System.out.println("4) Back");
                System.out.print("=> Please input your action: ");
                int input = scanner.nextInt();
                scanner.nextLine();
                if (input >= 1 && input <= 4) {
                    outer_switch:
                    switch (input) {
                        case 1:
                            while (true) {
                                try {
                                    System.out.println("==== Inputting Volunteer ====");
                                    System.out.println("ID : " + currentIdIndex);
                                    System.out.print("Name : ");
                                    String name = scanner.nextLine();
                                    System.out.print("Address : ");
                                    String address = scanner.nextLine();
                                    System.out.print("Input Salary : ");
                                    double salary = scanner.nextDouble();
                                    Volunteer volunteer = new Volunteer(currentIdIndex, name, address, salary);
                                    staffMembers.add(volunteer);
                                    // Time wasted on this exception : 30mn+
                                    System.out.println("Volunteer ID : " + staffMembers.get(currentIdIndex - 1).getId() + " Name : " + staffMembers.get(currentIdIndex - 1).getName() + " Address : " + staffMembers.get(currentIdIndex - 1).getAddress() + " Salary : " + staffMembers.get(currentIdIndex - 1).getSalary());
                                    System.out.println("\n");
                                    currentIdIndex++;
                                    break outer_switch;
                                } catch (Exception e) {
                                    System.err.println(e.getMessage());
                                    System.out.println("Please input correct data type according to field!!!");
                                    // time wasted on this clear buffer : 6 min
                                    scanner.nextLine();
                                }
                                System.out.println("New volunteer added successfully!!!");
                            }
                        case 2:
                            while (true) {
                                try {
                                    System.out.println("==== Inputting Salaried Employee ====");
                                    System.out.println("ID : " + currentIdIndex);
                                    System.out.print("Name : ");
                                    String name = scanner.nextLine();
                                    System.out.print("Address : ");
                                    String address = scanner.nextLine();
                                    System.out.print("Input Salary : ");
                                    double salary = scanner.nextDouble();
                                    System.out.print("Input Bonus : ");
                                    double bonus = scanner.nextDouble();
                                    SalariedEmployee salariedEmployee = new SalariedEmployee(currentIdIndex, name, address, bonus,salary);
                                    staffMembers.add(salariedEmployee);
                                    System.out.println("Volunteer ID : " + staffMembers.get(currentIdIndex - 1).getId() + " Name : " + staffMembers.get(currentIdIndex - 1).getName() + " Address : " + staffMembers.get(currentIdIndex - 1).getAddress() + "Bonus : " + staffMembers.get(currentIdIndex - 1).getBonus() + " Salary : " + staffMembers.get(currentIdIndex - 1).getSalary());
                                    System.out.println("\n");
                                    currentIdIndex++;
                                    break outer_switch;
                                } catch (Exception e) {
                                    System.err.println(e.getMessage());
                                    System.out.println("Please input correct data type according to field!!!");
                                    // time wasted on this clear buffer : 6 min
                                    scanner.nextLine();
                                }
                                System.out.println("New volunteer added successfully!!!");
                            }
                        case 3:
                            while (true) {
                                try {
                                    System.out.println("==== Inputting Hourly Employee ====");
                                    System.out.println("ID : " + currentIdIndex);
                                    System.out.print("Name : ");
                                    String name = scanner.nextLine();
                                    System.out.print("Address : ");
                                    String address = scanner.nextLine();
                                    System.out.print("Input Hour Worked : ");
                                    int hourWorked = scanner.nextInt();
                                    System.out.print("Input Rate : ");
                                    double rate = scanner.nextDouble();
                                    HourlySalaryEmployee hourlySalaryEmployee = new HourlySalaryEmployee(currentIdIndex, name, address, hourWorked,rate);
                                    staffMembers.add(hourlySalaryEmployee);
                                    System.out.println("Volunteer ID : " + staffMembers.get(currentIdIndex - 1).getId() + " Name : " + staffMembers.get(currentIdIndex - 1).getName() + " Address : " + staffMembers.get(currentIdIndex - 1).getAddress() + " Hour Worked : " + staffMembers.get(currentIdIndex - 1).getHourWorked() + " Rate : " + staffMembers.get(currentIdIndex - 1).getRate());
                                    System.out.println("\n");
                                    currentIdIndex++;
                                    break outer_switch;
                                } catch (Exception e) {
                                    System.err.println(e.getMessage());
                                    System.out.println("Please input correct data type according to field!!!");
                                    // time wasted on this clear buffer : 6 min
                                    scanner.nextLine();
                                }
                                System.out.println("New volunteer added successfully!!!");
                            }
                        case 4:
                            break outer_while_loop;
                    }
                } else {
                    System.out.println("Please only enter number between 1 <=> 5: !!!");
//                    mainMenu();
                }
            } catch (InputMismatchException ime) {
                System.out.println("Please only enter number between 1 <=> 5 !!!");
//                mainMenu();
            }
        }
    }

    public static void updateEmployee() {
        Scanner scanner = new Scanner(System.in);

        outer_while_loop:
        while(true){
            try{
                System.out.println("==================== Update Employee ====================");
                System.out.println("ID to update : ");
                int id = scanner.nextInt();
                scanner.nextLine();
                String changeThisStaff = staffMembers.get(id-1).getClass().toString();

                switch (changeThisStaff){
                    case "class Staff.Volunteer":
                        System.out.println("Change Name to? :");
                        String name = scanner.nextLine();
                        System.out.println("Change Address to? :");
                        String address = scanner.nextLine();
                        System.out.println("Change Salary to? :");
                        double salary = scanner.nextDouble();
                        Volunteer newVolunteer = new Volunteer(id, name, address, salary);
                        staffMembers.set(id-1, newVolunteer);
                        System.out.println("Volunteer ID : " + staffMembers.get(id - 1).getId() + " Name : " + staffMembers.get(id - 1).getName() + " Address : " + staffMembers.get(id - 1).getAddress() + " Salary : " + staffMembers.get(id - 1).getSalary());
                        System.out.println("\n");
                        break outer_while_loop;
                    case "class Staff.SalariedEmployee":
                        System.out.println("Change Name to? :");
                        name = scanner.nextLine();
                        System.out.println("Change Address to? :");
                        address = scanner.nextLine();
                        System.out.println("Change Bonus to? :");
                        double bonus = scanner.nextDouble();
                        System.out.println("Change Salary to? :");
                        salary = scanner.nextDouble();
                        SalariedEmployee newSalariedEmployee = new SalariedEmployee(id, name, address, bonus, salary);
                        staffMembers.set(id-1, newSalariedEmployee);
                        System.out.println("Volunteer ID : " + staffMembers.get(id - 1).getId() + " Name : " + staffMembers.get(id - 1).getName() + " Address : " + staffMembers.get(id - 1).getAddress() + " Bonus : " + staffMembers.get(id-1).getBonus() + " Salary : " + staffMembers.get(id - 1).getSalary());
                        System.out.println("\n");
                        break outer_while_loop;
                    case "class Staff.HourlySalaryEmployee":
                        System.out.println("Change Name to? :");
                        name = scanner.nextLine();
                        System.out.println("Change Address to? :");
                        address = scanner.nextLine();
                        System.out.println("Change Hour Worked to? :");
                        int hourWorked = scanner.nextInt();
                        System.out.println("Change Rate to> :");
                        double rate = scanner.nextDouble();
                        HourlySalaryEmployee hourlySalaryEmployee = new HourlySalaryEmployee(id, name, address, hourWorked, rate);
                        staffMembers.set(id-1, hourlySalaryEmployee);
                        System.out.println("Volunteer ID : " + staffMembers.get(id - 1).getId() + " Name : " + staffMembers.get(id - 1).getName() + " Address : " + staffMembers.get(id - 1).getAddress() + " Hour Worked : " + staffMembers.get(id-1).getHourWorked() + " Rate : " + staffMembers.get(id - 1).getRate());
                        System.out.println("\n");
                        break outer_while_loop;
                }
            }
            catch (Exception e){
                System.err.println(e.getMessage());
                scanner.nextLine();
            }
        }
    }

    public static void displayEmployee() {
        System.out.println(staffMembers.get(0));
    }

    public static void removeEmployee() {
        System.out.println("remove");
    }

    public static void exit() {
        System.exit(1);
    }
}


