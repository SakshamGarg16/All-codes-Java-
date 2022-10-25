import java.util.*;

class xToPoweNWithHeightLogN{

    public static int no(int x , int n ){
        if(x==0 && n!=0){
            return 0;
        }
        else if (n==0){
            return 1;
        }


        else if(n%2==0){
            return no(x , n/2) * no(x , n/2); 
        }
        else{
            return no(x,n/2)*no(x,n/2)*x ;
        }
       
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int n=sc.nextInt();
        
        
        System.out.print((no(x , n)));
        
        
            
    }
}