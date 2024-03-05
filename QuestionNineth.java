import java.util.Scanner;

public class QuestionNineth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");
        String input = scanner.nextLine();
        if (input.length() == 5) {
            int firstDigit = Character.getNumericValue(input.charAt(0));
            int secondLastDigit = Character.getNumericValue(input.charAt(4));
            int sum = firstDigit + secondLastDigit;
            System.out.println("Sum of the first and second last digit: " + sum);
        } else {
            System.out.println("Enter a valid 5-digit number.");
        }
    }
}
