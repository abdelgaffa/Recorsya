public class task8 {
    public static void main(String[] args) {
        int array[] = {65, 15, 66, 108, 9, 12, 10, 50, 155};
        int sum = calculateSum(array, array.length);
        System.out.println(sum);
    }

    public static int calculateSum(int array[], int n) {
        if (n == 0) {
            return 0;
        }
        return calculateSum(array, n-1 ) + array[n-1];
    }
}