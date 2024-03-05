import java.util.Scanner;
public class MarksOfSubjects {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your marks in subject 1: ");
        int s1 = s.nextInt();
        System.out.println("Enter your marks in subject 2: ");
        int s2 = s.nextInt();
        System.out.println("Enter your marks in subject 3: ");
        int s3 = s.nextInt();

        int total = s1 + s2 + s3;

        System.out.println("Total marks : " + total);

        double percentage = (total / 300.0) * 100;

        System.out.println("Percenatage : " + percentage + "%");

        Scanner.close();
    }
}
