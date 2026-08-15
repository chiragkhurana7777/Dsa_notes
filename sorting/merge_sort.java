import java.util.*;

public class merge_sort  {

    public static void merge(int[] arr,int low, int mid,int high){

        int[] temp= new int[arr.length];
        int left=low;
        int right=mid+1;

        int i=0;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[i]=arr[left];
                i++;
                left++;
            }
            else{
                temp[i]=arr[right];
                i++;
                right++;
            }
        }

        while(left<=mid){
            temp[i]=arr[left];
                i++;
                left++;
        }

        while(right<=high){
            temp[i]=arr[right];
                i++;
                right++;
        }

        for(int k=low;k<=high;k++){
            arr[k]=temp[k-low];
        }

    }


    public static void ms(int[] arr, int low, int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        
        ms(arr,low,mid);
        ms(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    
    
    public static  int[] mergesort(int[] nums) {
        int n=nums.length;
        ms(nums,0,n-1);
        return nums;
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

        mergesort(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        } 

        sc.close();
    }
}