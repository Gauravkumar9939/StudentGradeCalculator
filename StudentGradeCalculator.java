import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("StudentGradeCalculator");
            System.out.println("Name of Student: ");
            @SuppressWarnings("unused")
            String nameOfStudent = scanner.next();

            System.out.println("Enter number of subjects: ");
            int numSubjects = scanner.nextInt();
            int totalMarks = 0;
            int[] marks = new int[numSubjects];
            
            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
            }
            
            for (int mark : marks) {
                totalMarks += mark;
            }

            double averagePercentage = (double) totalMarks / numSubjects;

            char grade;
            if (averagePercentage >= 90) {
                grade = 'A';
            } else if (averagePercentage >= 75) {
                grade = 'B';
            } else if (averagePercentage >= 65) {
                grade = 'C';
            } else if (averagePercentage >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + averagePercentage);
            System.out.println("Grade: " + grade);
            
            System.out.println("Do you want to calculate again? (yes/no): ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }
        
        scanner.close();
 }
}