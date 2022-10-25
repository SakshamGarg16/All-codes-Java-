import java.util.*;
class Hollow_Butterfly{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        // For Upper Pattern
        for (int i=1 ; i<=n ; i++){
            System.out.print("*");
            for(int j=3 ; j<=i ; j++){
                System.out.print(" ");
            }
            if(i!=1)
              System.out.print("*");
            for(int j=1 ; j<=(n-i+1)*2-2; j++ ){
                System.out.print(" ");
            } 
            System.out.print("*");
            for(int j=3 ; j<=i ; j++){
                System.out.print(" ");
            }
            if(i!=1)
              System.out.print("*");
            System.out.println("");
        }
         //For lower pattern
        for (int i=n ; i>0 ; i--){
            System.out.print("*");
            for(int j=3 ; j<=i ; j++){
                System.out.print(" ");
            }
            if(i!=1)
              System.out.print("*");
            for(int j=1 ; j<=(n-i+1)*2-2; j++ ){
                System.out.print(" ");
            } 
            System.out.print("*");
            for(int j=3 ; j<=i ; j++){
                System.out.print(" ");
            }
            if(i!=1)
              System.out.print("*");
            System.out.println("");
        }
    }
}