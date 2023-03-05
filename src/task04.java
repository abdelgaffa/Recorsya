public class task04 {
    public static void main(String args[]) {
        int a[] = {44, 66, 99, 77, 6541, 22, 55};
        System.out.println("Largest number is: " + getMax(a, 7));
    }

    public static int getMax(int[] a, int total) {
        int max;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    max = a[i];
                    a[i] = a[j];
                    a[j] = max;
                }
            }
        }
        return a[total - 1];
    }
}