import java.util.InputMismatchException;
import java.util.Scanner;

public class Manu {

    static int currentIdIndex = 1;

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================== Staff Member ====================");
        System.out.println("Insert employee");
        System.out.println("Update employee");
        System.out.println("Display employee");
        System.out.println("Remove employee");
        System.out.println("Exit");
        System.out.println("=> Please choose your action: ");
        try {
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
                mainMenu();
            }
        } catch (InputMismatchException ime) {
            System.out.println("Please only enter number between 1 <=> 5 !!!");
            mainMenu();
        }
    }

    public static void insertEmployee(){
        System.out.println("insert");
    }
    public static void updateEmployee(){
        System.out.println("update");
    }
    public static void displayEmployee(){
        System.out.println("display");
    }
    public static void removeEmployee(){
        System.out.println("remove");
    }
    public static void exit(){
        System.exit(1);
    }

}

