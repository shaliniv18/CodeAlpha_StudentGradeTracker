import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        GradeTracker tracker = new GradeTracker();

        System.out.println("===== Student Grade Tracker====");

        System.out.print("Enter number of students:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i<= n; i++){
            System.out.println("\nStudent" + i);

            System.out.print("Enter Name:");
            String name = sc.nextLine();
            
            System.out.print("Enter Grade:");
            double grade = sc.nextDouble();
            sc.nextLine();

            tracker.addStudent(name, grade);
        }
        tracker.displayReport();

        sc.close();
}

    }