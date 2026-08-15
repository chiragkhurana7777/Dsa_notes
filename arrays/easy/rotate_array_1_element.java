//rotate one element;

public class rotate_array_1_element {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int n=arr.length;
        int num=arr[4];

        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=num;

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}