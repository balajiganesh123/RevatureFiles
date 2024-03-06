import java.util.*;
public class FahrenheitToCelsius {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value in Fahrenheit: ");
        double f = s.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println("Temparature in Celsius: " + c);
    }
}
