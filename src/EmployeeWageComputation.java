import java.util.Random;

public class EmployeeWageComputation {
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program!");

        // UC 1: Check Employee is Present or Absent
        checkEmployeeAttendance();

        // UC 2: Calculate Daily Employee Wage
        calculateDailyWage();

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
    // UC 2: Calculate Daily Employee Wage
    private static void calculateDailyWage() {
        int dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        System.out.println("Daily Employee Wage: " + dailyWage);
    }
}

