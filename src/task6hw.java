import java.util.Scanner;

public class task6hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int decimal = scanner.nextInt();
        String binary = toBinary(decimal);
        System.out.println("The binary representation of " + decimal + " is " + binary);
    }

    public static String toBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        } else if (decimal == 1) {
            return "1";
        } else {
            return toBinary(decimal / 2) + getBinaryDigit(decimal);
        }
    }

    public static int getBinaryDigit(int decimal) {
        if (decimal % 2 == 0) {
            System.out.print("0");
            return 0;
        } else {
            System.out.print("1");
            return 1;
        }
    }
}
