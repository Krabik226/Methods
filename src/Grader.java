import java.util.Scanner;

public class Grader {

    public static String calculateGrade(int score) {

        if (score < 0 || score > 100) {
            return "Invalid score. Please enter a number between 0 and 100.";
        }

        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a score: ");
        int userScore = scanner.nextInt();

        String grade = calculateGrade(userScore);
        System.out.println("The grade is: " + grade);

        scanner.close();
    }
}

