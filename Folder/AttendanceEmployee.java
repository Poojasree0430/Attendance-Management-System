import java.util.*;
public class AttendanceEmployee extends Employee implements Markable{
    private int[] attendanceArray =new int[7];
    AttendanceEmployee(String name,int id,String dept,int [] attendanceArray){
        super(name, id,dept);
        this.attendanceArray=attendanceArray;
    }
    public void markAttendance(int[] attendanceArray) {
        this.attendanceArray = attendanceArray;
    }

    public int calculatePresentDays() {
        int count = 0;
        for (int day : attendanceArray) {
            if (day == 1) count++;
        }
        return count;
    }
    public void showFullDetails() {
        showDetails();
        System.out.println("Attendance: " + Arrays.toString(attendanceArray));
        System.out.println("Total Present Days: " + calculatePresentDays());
        System.out.println();
    }

}
