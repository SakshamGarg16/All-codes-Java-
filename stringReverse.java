import java.util.*;

class stringReverse{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String n=sc.nextLine();
        StringBuilder T = new StringBuilder(n);

        for(int i = 0 ; i<n.length()-1 ; i++){
            int front = i;
            int back = n.length()-1-i ;

            char frontchar = n.charAt(front);
            char backchar = n.charAt(back);

            T.setCharAt(front , backchar);
            T.setCharAt(back , frontchar);
        }

        System.out.println(T);
    }
}