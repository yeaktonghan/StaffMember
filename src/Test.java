import Staff.HourlySalaryEmployee;
import Staff.SalariedEmployee;
import Staff.StaffMember;
import Staff.Volunteer;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList<StaffMember> staffMembers = new ArrayList<>();
        Volunteer volunteer = new Volunteer(1, "Demo Staff 1", "Phnom Penh", 120);
        staffMembers.add(volunteer);
        SalariedEmployee salariedEmployee = new SalariedEmployee(2, "Demo Staff 2", "Kandal", 20, 200);
        staffMembers.add(salariedEmployee);
        HourlySalaryEmployee hourlySalaryEmployee = new HourlySalaryEmployee(3, "Demo Staff 3", "KPS", 40, 5);
        staffMembers.add(hourlySalaryEmployee);
        Volunteer volunteer2 = new Volunteer(5, "Demo Staff 5", "Phnom Penh", 120);
        staffMembers.add(volunteer2);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee(6, "Demo Staff 6", "Kandal", 20, 200);
        staffMembers.add(salariedEmployee2);
        HourlySalaryEmployee hourlySalaryEmployee2 = new HourlySalaryEmployee(7, "Demo Staff 7", "KPS", 40, 5);
        staffMembers.add(hourlySalaryEmployee2);

        for (int indexCount = 0; indexCount < staffMembers.size(); indexCount++){
            if (staffMembers.get(indexCount).getId() == 6){
                System.out.println("Index of 6 is : " + indexCount);
            }
        }
        System.out.println(staffMembers.get(1).getClass().getSimpleName());

//        for ()



//        System.out.println(staffMembers.get(1));
//        staffMembers.remove(0);
//        System.out.println(staffMembers.get(1));

//        int id = 1;
//        for (int index = 0; index < staffMembers.size(); index++){
//            if(staffMembers.get(index).getId() == id){
//                System.out.println(index);
//            }
//        }

    }

}
