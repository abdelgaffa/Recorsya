public class task01 {
    public static void main(String[] args) {
        printHello(3);
        System.out.println("End of program");

    }

    public static void printHello(int n) {
        //База рекусия - условия для остановки
        if (n == 0) return;;

        System.out.println(n + "Hello!!!");
        System.out.println(n + "Bye");
        printHello(n - 1);   //РЕКУСИВНЫЙ вызов
    }

}
