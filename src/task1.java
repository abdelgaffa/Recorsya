public class task1 {
    public static void main (String[] args) {
        printResult(5);
    }
        public static void printResult(int n) {
            if (n == 0) return;
            printResult(n - 1);
            System.out.println(n + "    " + Math.pow(n, 2));
        }

}

