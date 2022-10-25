import java.util.*;
public class queueArray{
    static class queue{
        static int rear ;
        static int frnt;
        static int size;
        static int arr[];
        queue(int n){
            arr=new int [n];
            this.size=n;
            rear=-1;
            frnt =-1;
        }

        public static boolean isEmpty(){
            return rear==-1&&frnt==-1 ;
        }

        public static void add(int n){
            if((rear+1)%size==frnt){
                System.out.println("Array full");
                return;
            }
            if(frnt==-1)
            frnt=0;

            rear = (rear+1)%size;
            arr[rear]=n;
        }

        public static int remove(){

            if(isEmpty()){
                System.out.println("Array is empty");
                return -1;
            }
            int front=arr[frnt];
            if (frnt==rear)
            frnt=rear=-1;
            
            else
            frnt = (frnt+1)%size;

            return front;

        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Array is empty");
                return -1;

            }
            return arr[frnt];
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        queue obj = new queue(5);

        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);

        System.out.println(obj.remove());
        System.out.println(obj.remove());

        obj.add(5);
        obj.add(6);

        while(!obj.isEmpty()){
            System.out.println(obj.peek());
            obj.remove();

        }


    }
}