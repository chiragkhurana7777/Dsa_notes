package linkedList;

class Node{
    int data;
    Node next;

    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
    Node(int data){
        this.data=data;
        this.next=null;
    }


}

public class basic_structure {
    public static void main(String[] args) {
        int[] arr ={2,5,6,8};
        Node y = new Node(arr[2]);
        System.out.println(y.data);
        System.out.println(y.next);
    }
    
}
