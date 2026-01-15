import java.util.*;

public class loops {
    public static void main(String arge[]) {
        Scanner sc = new Scanner(System.in);
        // ## while loop
        // program for printing grisma 100x
        int i = 0;
        while (i < 100) {
            System.out.println("Grisma");
            i++;
        }

        // program for printing number from 1 to 10
        int x = 1;
        while (x <= 10) {
            System.out.println(x);
            x++;
        }

        // program for printing number from 1 to n
        System.out.println("enter the range n");
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            System.out.println(i + " ");
            i++;
        }

        // program for printing sum of first n natural numbers
        System.out.println("enter the range n");
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while (i <= n) {
            sum = sum + i; // sum += i;
            i++;
        }
        System.out.println("sum is " + sum);

        // ## For loop
        // simple program for for loop
        for (int i = 0; i <= 10; i++) {
            System.out.println("hello world");
        }

        // program for printing square pattern
        for (int i = 1; i <= 4; i++) {
            System.out.println("****");
        }

        // printing the reverse of a number
        int n = 10899;
        while (n > 0) {
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10; // n/=10
        }
        System.out.println();

        // program for reserving the given number n=10899
        int n = 10899;
        int rev = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            rev = (rev * 10) + lastdigit;
            n = n / 10;
        }
        System.out.println(rev);

        // ## do-while loop
        // simple program
        int counter = 1;
        do {
            System.out.println("hello world");
            counter++;
        } while (counter <= 10);

        // ## break statement
        for (int i = 1; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("i am out of the loop");

        // keep entering numbrs till users enters a multiple of 10
        System.out.println("enter your number");
        do {
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println(n);
        } while (true);

        // continue statement -- to skip an iteration
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        // program -- display all numbers enterd by user except multiples of 10
        do {
            System.out.println("enter your number");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println("number was: " + n);
        } while (true);

    }
}
