public class task06 {
    public static void main (String[] args) {
        int [] array = {65, 15, 66, 108, 9, 12, 10, 50, 155};
        int key = 9;
        System.out.println( recursiveSearch(array, key));
        System.out.println( recursiveSearch(array, 10));
        System.out.println( recursiveSearch(array, 15));
        System.out.println( recursiveSearch(array, 150));
    }

    private static boolean recursiveSearch(int[] array, int i) {
        return false;
    }

    static int recursiveSearch(int arr[], int l, int r,
                               int x)
    {

        if (r < l)
            return -1;

        if (arr[l] == x)
            return l;

        if (arr[r] == x)
            return r;

        return recursiveSearch(arr, l + 1, r - 1, x);
    }
}
