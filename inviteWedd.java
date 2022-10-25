import java.util.*;
class inviteWedd{

    public static int count(int n){
        if(n<=0){
            return 1 ;
        }

        //singles
        int sing = count(n-1);

        //Pair
        int pair = (n-1)*count(n-2);

        return sing+pair ;
    }

    public static void main(String args[]){

        Scanner sc=new Scanner (System.in);
        int n = sc.nextInt();

        System.out.println(count(n));


    }
}
