import java.util.*;


public class main {

    public static int binary2decimal(String st){
        int num=0;
        int len=st.length();
        int p2=1;

        for(int i=len-1;i>=0;i--){
            if(st.charAt(i)=='1'){
                num+=p2;
            }
            p2=p2*2;
        }

        return num;
    }

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
        String st=inttobinary(num);

        System.out.println("num in binary is : "+st);
        System.out.println("num'binary in decimal is : "+binary2decimal(st));
        // System.out.println("num'binary in decimal is : "+binary2decimal("1111111111111111111111111111111111111111111111111111111111111111"));

        sc.close();
    }
}