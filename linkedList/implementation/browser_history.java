class Node{

    String url;
    Node next;
    Node prev;

    public Node(String url) {
        this.url=url;
        this.next=null;
        this.prev=null;        
    }
    public Node(String url,Node next,Node prev) {
        this.url=url;
        this.next=next;
        this.prev=prev;        
    }
    
}

class browser{
    Node currentpage;
    public browser(String homepage) {
        currentpage = new Node(homepage);
    }
    
    void visit(String url){
        Node newNode = new Node(url);
        currentpage.next=newNode;
        newNode.prev=currentpage;
        currentpage=newNode; 
    }

    String back(int steps){
        while(steps!=0){
            if(currentpage.prev!=null){
                currentpage=currentpage.prev;
            }
            else break;
            steps--;
        }

        return currentpage.url;
    }
    
    String forward(int steps){
        while(steps!=0){
            if(currentpage.next!=null){
                currentpage=currentpage.next;
            }
            else break;
            steps--;
        }

        return currentpage.url;
    }
}

public class browser_history {
    public static void main(String[] args) {
        browser bh = new browser("leetcode.com");

        bh.visit("google.com");
        bh.visit("facebook.com");
        bh.visit("youtube.com");

        System.out.println(bh.back(1));      // facebook.com
        System.out.println(bh.back(1));      // google.com
        System.out.println(bh.forward(1));   // facebook.com

        bh.visit("linkedin.com");

        System.out.println(bh.forward(2));   // linkedin.com
        System.out.println(bh.back(2)); 
    }
}
