import java.util.*;

public class operators {
    public static void main(String srgs[]) {
        Scanner sc = new Scanner(System.in);

        // program for arithmetic operators
        int a = 10;
        int b = 5;
        System.out.println("addition: " + (a + b));
        System.out.println("substract: " + (a - b));
        System.out.println("multiplication: " + (a * b));
        System.out.println("division: " + (a / b));
        System.out.println("modulo: " + (a % b));

        // unary operators
        int a = 10;
        int b = ++a; // pre incremet
        System.out.println(b);
        System.out.println(a);

        int c = a++; // post increment
        System.out.println(c);
        System.out.println(a);

        int x = 5;
        int y = --x; // pre decrement
        System.out.println(y);
        System.out.println(x);

        int z = x--; // post decrement
        System.out.println(z);
        System.out.println(x);

        // Relational operators
        int d = 10;
        int g = 6;
        System.out.println(d > g);
        System.out.println(d < g);
        System.out.println(d == g);
        System.out.println(d != g);
        System.out.println(d >= g);
        System.out.println(d <= g);

        // logical operators
        System.out.println((3 > 2) && (5 > 3)); // logical AND - &&
        System.out.println((5 < 4) || (4 < 3)); // logical OR ||
        System.out.println(!(5 > 3));

        // Assignment operators
        int A = 10;
        // A = A + 10;
        A += 10;
        System.out.println(A);
        int B = 5;
        // B = B - 5;
        B -= 5;
        System.out.println(B);
        int c = 5;
        c *= 3;
        System.out.println(c);
        // can be done for division, modulo, e.t.c.

    }
}
