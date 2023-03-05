public class task02 {
    public static void main (String[] args) {
        System.out.println(f(1));
        System.out.println(f(2));
        System.out.println(f(3));
        System.out.println(f(4));
        System.out.println(f(5));
    }
    public static int f(int n) {
        if (n < 2) return 1; // база рекурсии
        return n * f(n-1);
    }

}
