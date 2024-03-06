import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of classes held: ");
        int totalClasses = scanner.nextInt();
        System.out.print("Enter the number of classes attended: ");
        int attendedClasses = scanner.nextInt();
        double attendancePercentage = (double) attendedClasses / totalClasses * 100;
        System.out.println("Percentage of classes attended: " + attendancePercentage + "%");
        if (attendancePercentage >= 75) {
            System.out.println("You are allowed to sit in the exam.");
        } else {
            System.out.print("Do you have a medical cause? (Enter 'Y' or 'N'): ");
            char medicalCause = scanner.next().charAt(0);
            if (medicalCause == 'Y' || medicalCause == 'y') {
                System.out.println("You are allowed to sit in the exam due to a medical cause.");
            } else {
                System.out.println("You are not allowed to sit in the exam.");
            }
        }
    }
}
