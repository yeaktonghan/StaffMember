import Staff.HourlySalaryEmployee;
import Staff.SalariedEmployee;
import Staff.StaffMember;
import Staff.Volunteer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Manu {

    static int currentId = 4;

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
                                    System.out.println("ID : " + Integer.valueOf(currentId).toString());
                                    System.out.print("Name : ");
                                    String name = scanner.nextLine();
                                    System.out.print("Address : ");
                                    String address = scanner.nextLine();
                                    System.out.print("Input Salary : ");
                                    double salary = scanner.nextDouble();
                                    Volunteer volunteer = new Volunteer(currentId, name, address, salary);
                                    staffMembers.add(volunteer);
                                    Volunteer volunteer1 = (Volunteer) staffMembers.get(currentId - 1);
                                    // Time wasted on this exception : 30mn+
                                    System.out.println("Volunteer ID : " + volunteer1.getId() + " Name : " + volunteer1.getName() + " Address : " + volunteer1.getAddress() + " Salary : " + volunteer1.getSalary());
                                    System.out.println("\n");
                                    currentId++;
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
                                    System.out.println("ID : " + currentId);
                                    System.out.print("Name : ");
                                    String name = scanner.nextLine();
                                    System.out.print("Address : ");
                                    String address = scanner.nextLine();
                                    System.out.print("Input Salary : ");
                                    double salary = scanner.nextDouble();
                                    System.out.print("Input Bonus : ");
                                    double bonus = scanner.nextDouble();
                                    SalariedEmployee salariedEmployee = new SalariedEmployee(currentId, name, address, bonus, salary);
                                    staffMembers.add(salariedEmployee);
                                    salariedEmployee = (SalariedEmployee) staffMembers.get(currentId -1);
                                    System.out.println("Volunteer ID : " + salariedEmployee.getId() + " Name : " + salariedEmployee.getName() + " Address : " + salariedEmployee.getAddress() + "Bonus : " + salariedEmployee.getBonus() + " Salary : " + salariedEmployee.getSalary());
                                    System.out.println("\n");
                                    currentId++;
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
                                    System.out.println("ID : " + currentId);
                                    System.out.print("Name : ");
                                    String name = scanner.nextLine();
                                    System.out.print("Address : ");
                                    String address = scanner.nextLine();
                                    System.out.print("Input Hour Worked : ");
                                    int hourWorked = scanner.nextInt();
                                    System.out.print("Input Rate : ");
                                    double rate = scanner.nextDouble();
                                    HourlySalaryEmployee hourlySalaryEmployee = new HourlySalaryEmployee(currentId, name, address, hourWorked, rate);
                                    staffMembers.add(hourlySalaryEmployee);
                                    System.out.println("Volunteer ID : " + ((HourlySalaryEmployee) staffMembers.get(currentId -1)).getId() + " Name : " + ((HourlySalaryEmployee) staffMembers.get(currentId - 1)).getName() + " Address : " + ((HourlySalaryEmployee) staffMembers.get(currentId - 1)).getAddress() + " Hour Worked : " + ((HourlySalaryEmployee) staffMembers.get(currentId - 1)).getHourWorked() + " Rate : " + ((HourlySalaryEmployee) staffMembers.get(currentId)).getRate());
                                    System.out.println("\n");
                                    currentId++;
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
        while (true) {
            try {
                System.out.println("==================== Update Employee ====================");
                System.out.println("ID to update : ");
                int id = scanner.nextInt();
                scanner.nextLine();
                // index of that ID will change if you delete something in between so you need to get the index instead of relying on its natural index
                int indexOfId = findIndexOfId(id);
                if (indexOfId != -1) {
                    String changeThisStaff = staffMembers.get(indexOfId).getClass().toString();

                    switch (changeThisStaff) {
                        case "class Staff.Volunteer":
                            System.out.println("Change Name to? :");
                            String name = scanner.nextLine();
                            System.out.println("Change Address to? :");
                            String address = scanner.nextLine();
                            System.out.println("Change Salary to? :");
                            double salary = scanner.nextDouble();
                            Volunteer newVolunteer = new Volunteer(id, name, address, salary);
                            staffMembers.set(indexOfId, newVolunteer);
                            System.out.println("Volunteer ID : " + ((Volunteer) staffMembers.get(indexOfId)).getId() + " Name : " + ((Volunteer) staffMembers.get(indexOfId)).getName() + " Address : " + ((Volunteer) staffMembers.get(indexOfId)).getAddress() + " Salary : " + ((Volunteer) staffMembers.get(indexOfId)).getSalary());
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
                            staffMembers.set(indexOfId, newSalariedEmployee);
                            System.out.println("Salary Employee ID : " + ((SalariedEmployee) staffMembers.get(indexOfId)).getId() + " Name : " + ((SalariedEmployee) staffMembers.get(indexOfId)).getName() + " Address : " + ((SalariedEmployee) staffMembers.get(indexOfId)).getAddress() + " Salary : " + ((SalariedEmployee) staffMembers.get(indexOfId)).getSalary() + " Bonus : " + ((SalariedEmployee) staffMembers.get(indexOfId)).getBonus());
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
                            staffMembers.set(indexOfId, hourlySalaryEmployee);
                            System.out.println("Hourly Employee ID : " + ((HourlySalaryEmployee) staffMembers.get(indexOfId)).getId() + " Name : " + ((HourlySalaryEmployee) staffMembers.get(indexOfId)).getName() + " Address : " + ((HourlySalaryEmployee) staffMembers.get(indexOfId)).getAddress() + " Hour Worked : " + ((HourlySalaryEmployee) staffMembers.get(indexOfId)).getHourWorked()+ " Rate : " + ((HourlySalaryEmployee) staffMembers.get(indexOfId)).getRate());
                            System.out.println("\n");
                            break outer_while_loop;
                    }
                } else {
                    System.err.println("This ID either have no index or out of range!!!");
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
                scanner.nextLine();
            }
        }
    }

    public static void displayEmployee() {
        int startPosition = 0;
        boolean continueShow = true;
        int pageCount = 1;
        Scanner scanner = new Scanner(System.in);

        do_while_loop:
        do {
            Cel
        }
    }

    public static void removeEmployee() {
        Scanner scanner = new Scanner(System.in);

        out_while_loop:
        while(true) {
            try {
                System.out.println("==================== Removing Employee ====================");
                System.out.println("Please input Employee ID you want to delete : ");
                int idToDelete = scanner.nextInt();
                int indexOfId = findIndexOfId(idToDelete);
                if(indexOfId != -1){
                    staffMembers.remove(indexOfId);
                    break out_while_loop;
                }
                else {
                    System.err.println("This ID either have no index or out of range!!!");
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void exit() {
        System.exit(1);
    }

    public static int findIndexOfId(int id) {

        for (int indexCount = 0; indexCount < staffMembers.size(); indexCount++) {
            if (staffMembers.get(indexCount).getId() == id) {
                return indexCount;
            }
        }
        return -1;
    }
}


