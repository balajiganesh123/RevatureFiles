public class QuestionFive {
    public static void main(String[] args) {
        // Pattern
        System.out.println("Pattern:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= (i % 2 == 0 ? 2 : 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
