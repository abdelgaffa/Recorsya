import java.util.Scanner;

public class task9hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("arr has only positive elements? " + hasOnlyPositiveElements(array));
        System.out.println("arr has no negative elements? " + hasNoNegativeElements(array));
    }

    public static boolean hasOnlyPositiveElements(int[] array) {
        if (array.length == 0) {
            return false;
        } else if (array.length == 1) {
            return array[0] > 0;
        } else {
            return array[0] > 0 && hasOnlyPositiveElements(getArray(array, 1, array.length));
        }
    }

    public static boolean hasNoNegativeElements(int[] array) {
        if (array.length == 0) {
            return false;
        } else if (array.length == 1) {
            return array[0] >= 0;
        } else {
            return array[0] >= 0 && hasNoNegativeElements(getArray(array, 1, array.length));
        }
    }

    public static int[] getArray(int[] arr, int start, int end) {
        int[] subArray = new int[end - start];
        for (int i = start; i < end; i++) {
            subArray[i - start] = arr[i];
        }
        return subArray;
    }
}
