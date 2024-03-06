import java.util.Scanner;

public class QuestionOne {
    public static void main(String []args){
        int length, breadth;
        System.out.println("Enter length and breadth of a Rectangle: ");
        Scanner s = new Scanner(System.in);
        length = s.nextInt();
        breadth = s.nextInt();
        if(length == breadth)
            System.out.println("It is a square");
        else
            System.out.println("It is not a square");
    }
}
