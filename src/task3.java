public class task3 {
    public static void main (String[] args) {
        System.out.println(f(1));
        System.out.println(f(2));
        System.out.println(f(3));
        System.out.println(f(4));
    }
    public static double f(int n) {
        if (n == 0) return 0;

        return Math.sqrt(2+f(n - 1));
    }
}
