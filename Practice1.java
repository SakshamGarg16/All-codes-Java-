import java.util.*;
class Practice1{
    public static void check(int arr[] , int i){
      if(i==arr.length-1){
        System.out.println("The array is sorted");
        return;
      }
      if(arr[i]<arr[i+1]){
        check(arr, i+1);
      }
      else{
        System.out.println("The array is not sorted");
        return;
      }

    }
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
      int size= sc.nextInt();

      System.out.println("Enter array element");
      int arr[]=new int[size];
      for(int i=0 ; i<size ; i++){
        arr[i]=sc.nextInt();
      }
      check(arr, 0);
    }
}