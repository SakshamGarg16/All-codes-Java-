import java.text.ChoiceFormat;
import java.util.*;
public class queueUsingcoll {
    public static void choice(int n){
        Queue<Integer> Q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice");
        n=sc.nextInt();
        switch(n){
            case 1:
                Q.add(sc.nextInt());
                choice(-1);
                break;
            case 2:
                System.out.println(Q.remove());
                choice(-1);
                break;
            case 3:
                System.out.println(Q.peek());
                choice(-1);
                break;
            default:
                while(!Q.isEmpty()){
                    System.out.print(Q.peek()+"->");
                    Q.remove();
                }
                System.out.println("Null");
                break;
        }
    }

    public static void main(String [] args){
        System.out.println(" 1. Add \n 2. To remove \n 3. To peek \n 4. To print and Exit");
        choice(-1);
    }
    
}
