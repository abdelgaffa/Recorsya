import java.util.Scanner;

public class task4hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        System.out.println("Number of digits: " + countDigits(n));
        System.out.println("Sum of digits: " + sumDigits(n));
    }

    public static int countDigits(int n) {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            n = -n;
        }
        return (int) Math.log10(n) + 1;
    }

    public static int sumDigits(int n) {
        if (n < 0) {
            n = -n;
        }
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumDigits(n / 10);
        }
    }
}
