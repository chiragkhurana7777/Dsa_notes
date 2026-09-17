package linkedList.DLL;

class Node{
    int val;
    Node next;
    Node back;

    Node(int val){
        this.val=val;
        this.next=null;
        this.back=null;
    }
    Node(int val,Node next,Node back){
        this.val=val;
        this.next=next;
        this.back=back;
    }
}



public class new_dll {

    private static void print(Node current){
        while(current!=null){
            System.out.print(current.val+" ");
            current=current.next;
        }

    }

    public static Node array_to_dll(int[] arr){

        Node head = new Node(arr[0]);
        Node prev=head;

        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],null, prev);
            prev.next=temp;
            prev=temp;
        }

        return head;

    }

    public static Node delete_head(Node head){

        if(head==null || head.next==null) return null;

        Node prev=head;
        head=head.next;
        head.back=null;
        prev.next=null;

        return head;
    }
    
    public static Node delete_tail(Node head) {
        
        if(head==null || head.next==null) return null;
    
        
        Node current =head;
        
        while(current.next!=null){
            
            current=current.next;
        }
        current.back.next=null;
        current.back=null;
        

    
        return head;
    
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        
        Node head= array_to_dll(arr);
        Node current = head;

        current=delete_head(head);
        current=delete_tail(head);
        
        print(current);



    }
}
