import java .util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AttendanceEmployee[] employees = new AttendanceEmployee[2];

        System.out.println("--------- Attendance Instructions ---------");
        System.out.println("Enter attendance for 7 days as 0 (Absent) or 1 (Present)");

        for (int i = 0; i < 2; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();
             sc.nextLine();
            System.out.print("Enter Attendance (7 values of 0/1): ");
            int[] attendance = new int[7];
            for (int j = 0; j < 7; j++) {
                attendance[j] = sc.nextInt();
            }
            sc.nextLine();
            employees[i] = new AttendanceEmployee(name, id, dept, attendance);
        }

        System.out.println("---------------------------------------------");
        System.out.println("Employee Details:");

        for (AttendanceEmployee emp : employees) {
            emp.showFullDetails();
        }

        System.out.println("---------------------------------------------");
        System.out.println("Total Employees Created: " + Employee.showEmployeeCount());
    }
}


