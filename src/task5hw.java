import java.util.Scanner;
public class task5hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = add(a, b);
        System.out.println("Sum: " + sum);

        int multiply = multiply(a, b);
        System.out.println("Multiplication: " + multiply);
    }

    public static int add(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            int sum = a ^ b;
            int carry = (a & b) << 1;
            return add(sum, carry);
        }
    }

    public static int multiply(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else if (b > 0) {
            return a + multiply(a, b - 1);
        } else {
            return multiply(a, -b);
        }
    }
}
