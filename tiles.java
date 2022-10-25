import java.util.*;
class tiles{
     public static int ways(int n , int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //Horizantal
        int hori = ways(n-1, m);

        //vertical
        int verti = ways(n-m , m);

        return hori+verti ;
     }

     public static void main(String [] args){

        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();
        int m=sc.nextInt();

        System.out.println(ways(n, m));
     }
}