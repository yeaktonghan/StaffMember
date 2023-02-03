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
                            System.out.println("Case 2");
                        case 3:
                            System.out.println("Case 3");
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
        System.out.println("update");
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


