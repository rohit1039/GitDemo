import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        int[] arr = new int[]{0, 4, 5, 6, 7, 9};

        int index = 0;
        for (int i = arr[0]; i < arr[arr.length - 1]; i++) {
            if (arr[index] != i) {
                System.out.println(i);
            } else {
                index++;
            }
        }

        int[] arrays = new int[]{91, -3, -1, 0, 74, 37, 100, 27, 21, 34, 61};
        sortArrays(arrays);
    }

    public static void sortArrays(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            System.out.println();
        }

        System.out.println(Arrays.toString(arr));

    }
}