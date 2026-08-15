
import java.util.*;

public class desceneding_sort {

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void selection_sort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[min]) {
                    min = j;
                }
            }

            swap(arr, min, i);

        }
    }

    public static void bubble_sort(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag = false;
                }
            }

            if (flag) {
                break;
            }
        }
    }

    public static void insertion_sort(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] < arr[j]) {
                swap(arr, j - 1, j);
                j--;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter array size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("enter array elements : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // choose sorting method:
        System.out.println("choose option to sort:\nEnter 1 for selection sort\nEnter 2 for bubble sort\nEnter 3 for insertion sort:");
        int x = sc.nextInt();

        if (x == 1) {
            selection_sort(arr, n); 
        }else if (x == 2) {
            bubble_sort(arr, n); 
        }else if (x == 3) {
            insertion_sort(arr, n); 
        }else {
            System.out.println("Invalid input.");
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

}
