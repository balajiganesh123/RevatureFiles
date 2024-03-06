public class QuestionFive {
    public static void main(String[] args) {
        // Pattern
        System.out.println("Pattern A");
        System.out.println();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= (i % 2 == 0 ? 2 : 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Pattern B");
        System.out.println();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 7 - 2 * (i - 1); k++) {
                if (k % 2 == 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
