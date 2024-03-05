public class AreaOfTriangle {
    public static void main(String []args){
        if(args.length != 2){
            System.out.println("Please provide base and height of the triangle");
        }
        double base = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

        double perimeter = 0.5 * base * height;

        System.out.println("Perimeter of the triangle: " +perimeter);
    }
}
