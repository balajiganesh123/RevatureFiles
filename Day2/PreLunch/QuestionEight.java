public class QuestionEight {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 500:");

        for (int num = 100; num <= 500; num++) {
            int originalNumber = num;
            int result = 0;
            int n = String.valueOf(num).length();

            int temp = num;
            while (temp != 0) {
                int digit = temp % 10;
                result += Math.pow(digit, n);
                temp /= 10;
            }

            if (result == originalNumber) {
                System.out.println(originalNumber);
            }
        }
    }
}
