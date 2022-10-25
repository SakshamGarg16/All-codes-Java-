import java.util.*;
class quickSort{

    public static int sort(int arr[] ,int low , int high){
        int pivort = arr[high];

        int i=low-1;

        for(int j=low;j<high;j++){
            if(arr[j]<pivort){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        arr[high]=arr[i];
        arr[i]=pivort;
        return i;
    }

    public static void sor(int arr[] , int low , int high){
        if(low<high){
            int pidx = sort(arr,low,high);

            sor(arr, low, pidx-1);
            sor(arr, pidx+1, high);

        }
        
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0 ; i<size ; i++){
            arr[i]=sc.nextInt();
        }

        sor(arr , 0 , size-1);

        for(int i=0 ; i<size ; i++)
        System.out.print(arr[i]+" ");
    }
}