import java.util.*;

class pascalNumber{
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s = sc.nextInt();
        for (int i=0 ; i<s ; i++){
            for(int j=0 ; j<s-i ; j++){
                System.out.print(" ");
            }
            for(int j=0 ; j<=i ; j++){
                System.out.print((factorial(i) / ( factorial(i-j) * factorial(j))) + " ");
            }
            System.out.println();
        }
    }
}