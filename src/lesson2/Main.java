package lesson2;

import java.util.*;

public class Main {
    private static void swap(Integer[] arr, int index1, int index2) {
        Integer temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void selectionSort(Integer[] arr, Comparator<Integer> comparator) {
        int iMin;
        for (int i = 0; i < arr.length - 1; i++) {
            iMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (comparator.compare(arr[j], arr[iMin]) < 0) {
                    iMin = j;
                }
            }
            swap(arr, i, iMin);
        }
    }

    public static void insertionSort(Integer[] arr, Comparator comparator) {
        Integer key;
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            key = arr[i];
            while (j > 0 && comparator.compare(key, arr[j - 1]) < 0) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = key;
        }
    }

    public static void bubbleSort(Integer[] arr, Comparator comparator) {
        boolean isSwap;
        for (int i = arr.length - 1; i > 0; i--) {
            isSwap = false;
            for (int j = 0; j < i; j++) {
                if (comparator.compare(arr[j + 1], arr[j]) < 0) {
                    swap(arr, j, j + 1);
                    isSwap = true;
                }
            }
            if (!isSwap) {
                break;
            }
        }
    }


    public static void main(String[] args) {
        Random random = new Random();
        Integer[] arr = new Integer[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = random.nextInt(51);
        }

        double m = System.currentTimeMillis();
//        selectionSort() = 4950.0 ms
//        selectionSort(arr, Comparator.reverseOrder());

//        insertionSort() = 8923.0 ms
//        insertionSort(arr, Comparator.reverseOrder());

//        bubbleSort() = 27351.0 ms
//        bubbleSort(arr, Comparator.reverseOrder());
        System.out.println(System.currentTimeMillis() - m);

//        System.out.println(Arrays.toString(arr));

    }
}
