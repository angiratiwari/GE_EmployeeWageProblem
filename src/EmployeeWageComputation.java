import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program!");

        // UC 1: Check Employee is Present or Absent
        checkEmployeeAttendance();
    }
    // UC 1: Check Employee Attendance
    private static void checkEmployeeAttendance() {
        int attendance = new Random().nextInt(2); // Random 0 or 1
        if (attendance == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}

