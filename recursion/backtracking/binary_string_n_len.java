package recursion.backtracking;

public class binary_string_n_len {

    public static void binary_string(String current , int n){

        if(current.length()==n){
            System.out.println(current);
            return;
        }
        binary_string(current + "0", n);
        binary_string(current + "1", n);

    }

    public static void main(String[] args) {
        
        String ans="";
        binary_string(ans, 2);

    }
}
