import java.util.*;

class PButteerfly_pattern{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int r = sc.nextInt();

        // upper half

        for (int i = 1; i <= r; i++){

            for(int j=1 ; j<=i ; j++){

               System.out.print("*");

            }
               for (int k = 1; k <= (r-i)*2 ; k++)

               System.out.print(" ");

               for(int j=1 ; j<=i ; j++){

               System.out.print("*");

               }

            System.out.println();
            
        }

        // lower half

        for (int i = r; i > 0; i--){

            for(int j=1 ; j<=i ; j++){

               System.out.print("*");

            }

               for (int k = 1; k <= (r-i)*2 ; k++)

               System.out.print(" ");

               for(int j=1 ; j<=i ; j++){

               System.out.print("*");

               }

            System.out.println();
            
        }

    }

}
