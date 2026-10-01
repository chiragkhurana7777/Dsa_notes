import java.util.*;


public class main {

    public static String inttobinary(int n){
        StringBuilder st = new StringBuilder();

        while(n>0){
            if(n%2==1) st.append('1');
            else st.append('0');
            n/=2;
        }

        return st.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter value of num: ");
        int num= sc.nextInt();
        
        System.out.println("num in binary is : "+inttobinary(num));

        sc.close();
    }
}