import java.util.*;
class Practice3{ 

    public static int divide(int arr[] , int n){
        int j=0;
        int m=0;
        for(int i=0 ;i<n && j<=n ; i+=m ){
            if(arr[i]!=0)
            m=arr[i];
            j++;
        }
        if(m==0){
            return -1;
        }
        else
        return j;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int arr[]=new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(".......");

           System.out.print(divide( arr ,  n));

    }
}