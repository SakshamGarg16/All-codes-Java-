import java.util.*;

class LL{
    Node head;
    public class Node{
        Node next;
        String data;

        Node(String data){
            this.next =null;
            this.data = data;
        }
    }

    public void addfirst(String data){
        Node newnode = new Node(data);

        newnode.next=head;
        head=newnode;
    }

    public void addlast(String data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode ;
            return;
        }

        Node curr = head;

        while(curr.next != null){
            curr = curr.next ;
        }
        curr.next = newnode;
    }

    public void printlist(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node cur = head;

        while(cur !=null){
            System.out.print(cur.data + "->");
            cur = cur.next;
        }
        System.out.println("null");
    }

    public void reverselist(){
        if(head==null||head.next==null){
            return;
        }
        Node prev = head ;
        Node curr = head.next;

        while(curr !=null){
            Node nxt = curr.next;

            curr.next = prev;
            
            prev = curr;
            curr = nxt ;
            
        }
        head.next = null;
        head=prev;
    }
    // public void reverseList() {
    //     if(head == null || head.next == null) {
    //         return;
    //     }
  
    //     Node prevNode = head;
    //     Node currNode = head.next;
    //     while(currNode != null) {
    //         Node nextNode = currNode.next;
    //         currNode.next = prevNode;
    //         prevNode = currNode;
    //         currNode = nextNode;
    //     }
    //     head.next = null;
    //     head = prevNode;
    // }

    public void removefirst(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        
        head=head.next;


    }

    public void removelast(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        Node pre = head ;
        Node curr = head.next;
        while(curr.next !=null){
            curr = curr.next;
            pre = pre.next;
        }
        pre.next=null;

    }
 
    static LL obj = new LL();
    public void choose(int n){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a choice");

        n = sc.nextInt();

        
        switch (n) {
            case 1:
                String S = sc.next();
                obj.addfirst(S);
                choose(0);
                
                
                break;
            
            case 2:
                S = sc.next();
                obj.addlast(S);
                choose(0);
                break;
            
            case 3:
                obj.removefirst();
                choose(0);
                break;
            
            case 4:
                obj.removelast();
                choose(0);
                break;

            case 5:

                obj.reverselist();
                choose(0);
                break;

            case 6:
                obj.printlist();
                choose(0);
                break;
        
            default:

                break;
        }
    }

    public static void main(String [] args){
        

        System.out.println("To add first press 1 \nTo add last press 2 \nTo remove first digit press 3 ");
        System.out.println("To romove last digit press 4 \nTo reverse press 5 \nTo print press 6 \nTo quit press 7");

        obj.choose(0 );
        //hiii
        //what's upp


    }
}
