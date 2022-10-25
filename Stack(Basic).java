import java.util.*;
public class stackL{
    static class stack{

        ArrayList<Integer> list = new ArrayList<>();

        public void push(int dd){
            list.add(dd);
        }

        public boolean isEmpty(){
            return list.size()==0;
        }

        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top =  list.remove(list.size()-1);
            return top;
        }

        public int peek(){ 
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);

        }

    }
    public static void main(String args[]){

        stack Stack = new stack();


        Stack.push(9);
        Stack.pop();
        Stack.push(6);
        Stack.push(6);
        Stack.push(7);
        while(!Stack.isEmpty()){
            System.out.println(Stack.peek());
            int t=Stack.pop();

        }

        
    }
}