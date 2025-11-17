import java.util.Scanner;

class Area_of_a_Circle {
    public static void main (String[]args) {
        Scanner Circle = new Scanner(System.in);
        
        System.out.println("Enter radius of a Circle: ");
        double radius = Circle.nextDouble();
        
        double area = Math.PI * Math.pow(radius,2);
        
        System.out.println("The area of a circle with radius of " + radius + " is: "+ area);
        
        Circle.close();
    }
}