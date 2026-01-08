import java.util.*;

public class variables {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // program 1 : sum of two numbers
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int b = sc.nextInt();
        System.out.print("The sum of these numbers are : ");
        int sum = a + b;
        System.out.println(sum);

        // program 2 : product of two numbers
        System.out.println("Enter the first number : ");
        int x = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int y = sc.nextInt();
        System.out.println("The product of these number are : ");
        int product = x * y;
        System.out.println(product);

        // program 3 : area of circle
        System.out.println("enter a number for radius");
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);

        // program 4: average of 3 numbers
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.println("enter the third number");
        int c = sc.nextInt();
        int average = (a + b + c) / 3;
        System.out.println(average);

        // program 5: area of square
        System.out.println("enter the side of square");
        int side = sc.nextInt();
        int area_of_square = side * side;
        System.out.println(area_of_square);

        // program 6: cost of item
        System.out.println("enter the cost of pencil");
        float pencil_cost = sc.nextFloat();
        System.out.println("enter the cost of pen");
        float pen_cost = sc.nextFloat();
        System.out.println("enter the cost of eraser");
        float eraser_cost = sc.nextFloat();
        Float total_cost = pencil_cost + pen_cost + eraser_cost;
        System.out.println(total_cost);

        // adds on gst- 18%
        float new_total_cost = total_cost + (0.18f * total_cost);
        System.out.println(new_total_cost);

    }
}
