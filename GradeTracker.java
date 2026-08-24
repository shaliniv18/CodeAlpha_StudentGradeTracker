import java.util.ArrayList;

public class GradeTracker {
    
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, double grade){
        students.add(new Student(name, grade));
    }
    public void displayReport(){

        if(students.isEmpty()){
            System.out.println("No student data available.");
            return;
        }
        double total = 0;
        double highest = students.get(0).getGrade();
        double lowest = students.get(0).getGrade();
        System.out.println("\n===== Student Report =====");
        for(Student s : students){
            System.out.println("Name : " + s.getName());
            System.out.println("Grade :" + s.getGrade());
            System.out.println("-------------------------");
            total += s.getGrade();
            if (s.getGrade() > highest){
                highest = s.getGrade();
            }
            if (s.getGrade() < lowest){
                lowest = s.getGrade();
            }
        }
        double average = total / students.size();

        System.out.println("Total Students : " + students.size());
        System.out.printf("Average Grade :  %.2f%n", average);
        System.out.println("Highest Grade : " + highest);
        System.out.println("Lowest Grade : " + lowest);
       }
}