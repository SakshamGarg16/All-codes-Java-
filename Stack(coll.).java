import java.util.*;
class stk{
    static Stack<Integer> stack = new Stack<>();
    public static void addbelow(Stack<Integer> stack , int d){
        if(stack.isEmpty()){
            stack.push(d);
            return ;
        }
        int T = stack.pop();
        addbelow(stack , d);
        stack.push(T);
    }

    public static void reverse(Stack<Integer> stack ){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        reverse(stack);
        addbelow(top);

    }

    // public static void choice(int n){
    //     scanner sc = new Scanner (System.in);

    //     System.out.println("Enter Choice");
    //     n = sc.nextInt();

    //     switch(n){
    //         case 1:

    //             break ;
    //     }
    // }

    
    public static void main(String args[]){
        

        stack.push(5);
        stack.pop();
        stack.push(8);
        stack.push(7);
        stack.push(6);

        // while(!stack.isEmpty()){
        //     System.out.println(stack.peek());
        //     stack.pop();
        // }

        addbelow(stack, 9);

        reverse(stack);

       


        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }

    }
}