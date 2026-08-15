// java Main < input.txt > output.txt -> for two seprate files

import java.util.*;

public class selection_bubble_insertion_sort {

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void selection_sort(int[] arr, int n) {
        for (int i = 0; i <= n - 2; i++) {
            int min = i;

            //find minimum:
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            //swap minimum and ith element;
            swap(arr, min, i);

        }
    }

    public static void bubble_sort(int[] arr, int n) {

        for (int i = n - 1; i >= 1; i--) {
            boolean flag=true;

            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    flag=false;
                }

            }
            
            if(flag) break;
            
            System.out.println("It runned.");
            
        }
    }

    public static void insertion_sort(int[] arr, int n) {
        for (int i = 0; i <= n-1; i++) {
            int j=i;
            while(j>0 && (arr[j-1]>arr[j])){
                swap(arr, j-1, j);
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

        // selection_sort(arr,n);
        // bubble_sort(arr, n);
        insertion_sort(arr, n);


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
