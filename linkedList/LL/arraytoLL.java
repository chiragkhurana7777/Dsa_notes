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

public class arraytoLL{

    private static Node convertarrtoLL(int[] arr){ //convert an array to linkedList
        Node head= new Node(arr[0]);
        Node mover=head;

        for(int i=1;i<arr.length;i++){
            Node temp= new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }

        return head;
    }

    static int lengthofLL(Node head){ // length of LL

        int len=0;
        Node temp=head;
        while(temp!=null){
            
            temp=temp.next;
            len++;
        }

        return len;
    }

    private static boolean contains(Node head,int k){

        Node temp = head;
        while(temp!=null){
            if(temp.data==k) return true;
            temp=temp.next;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        
        Node head =convertarrtoLL(arr);
        // System.out.println(head.data);
        
        //LL transversal:

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

        System.out.println("the length of LL is "+ lengthofLL(head));

        System.out.println("does it contains 4 :"+ contains(head, 4));
        System.out.println("does it contains 10 :"+ contains(head, 10));
    }
}