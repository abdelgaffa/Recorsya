import java.util.Scanner;

public class task2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        readAndwrite(scanner);
    }
        public static void readAndwrite(Scanner sc){
            System.out.println("next num = ");
            int x = sc.nextInt();
            if (x == 0) return;
            readAndwrite(sc);
            System.out.println(x);
    }


}
