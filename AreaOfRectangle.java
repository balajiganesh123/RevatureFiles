public class AreaOfRectangle {
    public static void main(String []args)throws Exception{
	if(args.length != 2){
		System.out.println("Please provide length and breadth of a Rectangle");
	}
        double length = Double.parseDouble(args[0]);
        double breadth = Double.parseDouble(args[1]);

        double area = length * breadth;

        double perimeter = 2 * (length + breadth);

        System.out.println("Area of Rectangle : " + area);

        System.out.println("Perimeter of Rectangle : " + perimeter);
    }
}
