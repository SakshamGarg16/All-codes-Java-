import java.util.*;

class LL{
    Node head;

    public class Node{
        Node next;
        Int data;

        void Node(){
            this.data =data;
            this.next =null;
        }
    }

    public void addfirst(int data){
        Node newnode = new Node(data);

        newnode.next=head;
        head=newnode;
    }

    public void addlast(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            return;
        }

        Node curr = head;

        while(curr.next !=null){
            curr=curr.next;
        }
        curr.next=newnode;
    }

    public void removefirst(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }

        head=head.next;
    }

    public void removelast(){
        if(head==null){
            System.out.println("Empty list");
        }

        Node curr = head;
        while(curr.next.next ==null){
            curr = curr.next;
        }
        curr.next = null;
        
    }

    public void printlist(){
        if(head==null){
            System.out.println("Empty list");
        }
        Node curr = head;

        while(curr!= null){
            System.out.print(curr.data + " -> ");
        }
        System.out.println("Null");
    }

    public void reverse(){
        if(head == null || head.next==null){
            return;
        }
        Node prev =head;
        Node curr = head.next;

        while(curr!=null){
            Node nxt = curr.next;

            curr.next=prev;

            prev = curr;
            curr=nxt;
        }

        head.next=null;
        head=prev;
    }

    static LL obj = new LL ();

    public void choice(int n){

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("Enter choice");

        switch(n){
            case 1:
                int s = sc.nextDouble();
                obj.addfirst(s);
                choice(0);
                break;
            
            case 2:
                s=sc.nextDouble();
                obj.addlast(s);
                choice(0);

                break;

            case 3:
                obj.removefirst();
                choice(0);
                break;

            case 4:
                obj.removelast();
                choice(0);
                break;

            case 5:
                obj.reverse();
                choice(0);
                break;

            case 6:
                obj.printlist();
                choice(0);
                break;

            default:
                break;
        }


    }

    public static void main(String [] args){

        System.out.println("1. Enter first \n 2. Enter last \n 3. Remove first \n 4. Remove last \n 5. Reverse \n 6. Print \n 7. Exit");

        obj.choice(0);

    }
}