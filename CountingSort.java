import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int[] arr) {
        if (arr.length == 0)
            return;

        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        
        int[] count = new int[max + 1];

        
        for (int num : arr) {
            count[num]++;
        }

    
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        System.out.println("Before Sorting: " + Arrays.toString(arr));
        countingSort(arr);
        System.out.println("After Sorting:  " + Arrays.toString(arr));
    }
}
