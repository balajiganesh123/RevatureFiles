public class Swapping {
    public static void main(String []args){
        int a = 6, b = 8;
        System.out.println("Before swap: " + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap: " + a + " " + b);
    }
}
