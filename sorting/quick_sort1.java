import java.util.*;

public class quick_sort1 {
    
    public static void swap(int[] arr, int x, int y) {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    public static int pivotf(int[] arr,int low,int high) {
        int pivot=arr[low];
        int i=low;
        int j=high;

        while(i<j){

            while(arr[i]>=pivot && i<=high-1){
                i++;
            }

            while(arr[j]<pivot && j>=low+1){
                j--;
            }

            if(i<j) swap(arr, i, j);

        }
        swap(arr,low,j);

        return j;






    }


    public static void quick_sort(int[] arr, int low,int high) {
        if(low<high){
            int pIndex=pivotf(arr, low, high);
            quick_sort(arr, low, pIndex-1);
            quick_sort(arr, pIndex+1,high);
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

        quick_sort(arr, 0, n-1);
        


        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        } 

        sc.close();
    }
}
