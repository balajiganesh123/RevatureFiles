import java.util.Scanner;

public class QuestionTenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        String input = scanner.nextLine();
        if (input.length() == 3) {
            int digit1 = Character.getNumericValue(input.charAt(0));
            int digit2 = Character.getNumericValue(input.charAt(1));
            int digit3 = Character.getNumericValue(input.charAt(2));
            int sum = digit1 + digit2 + digit3;
            System.out.println("Sum of the digits: " + sum);
        } else {
            System.out.println("Please enter a valid 3-digit number.");
        }
    }
}
