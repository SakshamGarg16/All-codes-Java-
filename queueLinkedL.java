import java.util.*;
public class queueLinkedL {
    static Node head =null;
    static Node tail =null;

    static class Node{
        int data;
        Node next;
        Node(int dd){
            this.data=dd;
            this.next=null;
        }

    }

    static class Queue{
        

        public static boolean isEmpty(){
            return head==null&&tail==null;
        }

        public static void add(int dat){
            Node newNode = new Node(dat);
            if(tail==null){
                head=tail=newNode;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int remove(){
            if(tail==null){
                System.out.println("Empty LinkedList");
                return -1;
            }

            if(head==tail){
               tail =null; 
            }

            int frt = head.data;
            head = head.next;
            return frt;
        }

        public static int peek(){
            return head.data;
        }


    }

    public static void choice(int n){
        Scanner sc = new Scanner (System.in);
        Queue obj = new Queue();

        System.out.println("Enter Choice");
        n=sc.nextInt();

        switch(n){
            case 1:
                obj.add(sc.nextInt());
                choice(-1);
                break;
            case 2:
                System.out.println(obj.remove());
                choice(-1);
                break;
            case 3:
                System.out.println(obj.peek());
                choice(-1);
                break;

            case 4:
            Node nop = head;
                while(nop!=null){
                    System.out.print(nop.data +"->");
                    nop = nop.next;

                }
                System.out.println("Null");
                choice(-1);
                break;
            default:
                break;
        }

    }

    public static void main(String args[]){
        System.out.println(" 1. To add \n 2. To remove \n 3. To peek \n 4. Print \n 5: Exit");

        choice(-1);
    }
    
}
