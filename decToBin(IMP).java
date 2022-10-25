import java.util.*;

class practice2{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        
            System.out.println("Enter choice - 1 for dec to bin ans 2 for bin to dec");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                     decToBin(n);
                    break;
                case 2 : 
                      binToDec(n);
                    break;      
            
                default: System.out.println("Invalid Input");
                    break;
            }
    }

    public static void decToBin(int n){
        String t = "";
        while (n!=0){
            t = n%2 + t ;
            n=n/2;
        }
        System.out.println(t);
    } 
    public static void binToDec(int n){
        int t=0;
        int base = 1;
        while (n!=0){
            int lastDig = n%10;
            t = t + (lastDig * base) ;
            n /= 10 ;
            base *=2;
        }
        System.out.println(t);
    }

}