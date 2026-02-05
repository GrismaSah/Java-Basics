import java.util.*;

public class functions {

    // program 1 - find the product of a & b
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    // program -2 find the factorial
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f; // factorial of n
    }

    // program -3 binomial coefficient
    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    // func to calc int sum
    public static int sum(int a, int b) {
        return a + b;
    }

    // func to calc float sum
    public static float sum(float a, float b) {
        return a + b;
    }

    // program to check if a number is prime or not
    public static boolean isprime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // program to find prime in a range
    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // program to convert a number from binary to decimal
    public static void binToDec(int binNum) {
        int myNum = binNum; // stores original value
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;

        }
        System.out.println("decimal of" + myNum + " = " + decNum);
    }

    // program to convert decimal to binary
    public static void decToBin(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while (decNum > 0) {
            int lastDigit = decNum % 10;
            binNum = binNum + (lastDigit * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum % 10;
        }
        System.out.println("binary number is " + myNum + " = " + binNum);
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter the number");
        // int a = sc.nextInt();
        // System.out.println("enter the second number");
        // int b = sc.nextInt();
        // int result = multiply(a, b);
        // System.out.println(result);

        // int result = factorial(4);
        // System.out.println(result);

        // System.out.println(binCoeff(5, 2));

        // System.out.println(sum(4, 5));
        // System.out.println(sum(4.5f, 5.5f));

        // System.out.println(isprime(5));

        // primeInRange(20);

        // binToDec(101);

        decToBin(11);

    }

}
