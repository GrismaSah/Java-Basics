public class patterns1 {
    public static void main(String args[]) {

        // program for printing star
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // // for every row, run the cols
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // // when one row is printed, we need to add a new line
        // System.out.println();
        // }

        // printing inverted-star pattern
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= (n - i + 1); j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // program for printing half pyramid pattern
        // int n = 4;
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // program for printing character pattern
        int n = 4;
        char ch = 'A';
        for (int line = 1; line <= n; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }

    }
}
