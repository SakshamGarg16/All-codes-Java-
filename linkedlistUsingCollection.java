import java.util.*;

class FO{
    static Node head;
    public class Node{
        int data;
        Node next;

        void Node(){
            this.data=data;
            this.next=null;
        }
    }

    public static void reverse(int n , LinkedList<Integer> LL){
        if(n==LL.size()||head==null||head.next==null){
            return;
        }

        Node prev= head;
        Node curr = prev.next;
        while(curr!=null){
            Node nxt=curr.next;

            curr.next=prev;

            prev=curr;
            curr=nxt;
            nxt=nxt.next;
        }

        head.next=null;
        head = prev;


    }


    public static void Process(int n , LinkedList<Integer> LP){
        Scanner sc = new Scanner (System.in);
        System.out.println("Make a choice \n 1.Add first \n 2.Add last \n 3.Print");
        n = sc.nextInt();

        switch(n){
            case 1 :
                int s = sc.nextInt();
                LP.addFirst(s);
                Process(0, LP);
                break;
            case 2 :
                s = sc.nextInt();
                LP.addLast(s);
                Process(0, LP);
                break;

            case 3:
                LP.removeFirst();
                Process(0, LP);
                break;

            case 4:
                LP.removeLast();
                Process(0, LP);
                break;

            case 5:
                reverse(0,LP);
                Process(0, LP);
                break;

            case 6:
                System.out.println(LP);
                Process(0, LP);

            default:
                return;

        }

    }
    public static void main(String [] args){
        LinkedList<Integer> LP = new LinkedList<>();

        Process(0 , LP);
    }
}
