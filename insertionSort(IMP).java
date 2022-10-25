import java.util.*;

class insertionSort{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int size=sc.nextInt();
            
            //Accepting array element
            System.out.println("Enter Array Elements");
            int Array[] = new int [size];
            for(int i=0; i<size ; i++){
                Array[i]=sc.nextInt();
            }

            //Sorting Array
            for(int i=1 ; i<size ; i++){
                int current = Array[i];
                int j=i-1;
                while(j>=0 && Array[j]>current){
                    Array[j+1]=Array[j];
                    j--;
                }
                Array[j+1]=current;
            }
            printArr(Array);
        }
        public static void printArr(int arr[]) {
            for(int i=0 ; i<arr.length ; i++){
                System.out.print(arr[i] + " ");
            }
    }
}