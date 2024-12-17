import java.util.Random;

public class EmployeeWageComputation {
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int PART_TIME_HOUR = 4;
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program!");

        // UC 1: Check Employee is Present or Absent
        checkEmployeeAttendance();

        // UC 2: Calculate Daily Employee Wage
        calculateDailyWage();

        // UC 3: Add Part Time Employee Wage
        calculatePartTimeWage();

        // UC 4: Solve using Switch Case
        solveUsingSwitchCase();

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
    // UC 3: Add Part Time Employee Wage
    private static void calculatePartTimeWage() {
        int partTimeWage = WAGE_PER_HOUR * PART_TIME_HOUR;
        System.out.println("Part Time Employee Wage: " + partTimeWage);
    }
    // UC 4: Solve using Switch Case
    private static void solveUsingSwitchCase() {
        int empType = new Random().nextInt(3); // 0: Absent, 1: Full-Time, 2: Part-Time
        int empHours;

        switch (empType) {
            case 1:
                empHours = FULL_DAY_HOUR;
                System.out.println("Employee is Full-Time");
                break;
            case 2:
                empHours = PART_TIME_HOUR;
                System.out.println("Employee is Part-Time");
                break;
            default:
                empHours = 0;
                System.out.println("Employee is Absent");
        }

        int wage = WAGE_PER_HOUR * empHours;
        System.out.println("Wage for the Day: " + wage);
    }
}

