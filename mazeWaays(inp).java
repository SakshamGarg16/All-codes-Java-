import java.util.*;

class mazeWaays{
    public static int countPath(int i , int j , int n , int m){
        if(i==n && j==m){
            return 0;
        }
        if(i==n-1 || j==m-1){
            return 1;
        }
        //Downwards
        int down= countPath(i+1, j, n, m);

        //Rigth
        int rigth = countPath(i, j+1, n, m);

        return down+rigth ;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

       System.out.println(countPath(0,0,n,m));


    }
}