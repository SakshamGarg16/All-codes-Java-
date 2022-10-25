import java.util.*;
class arrayList{

    public static void printarray(ArrayList<Integer> subSet){
        for( int i=0 ; i<subSet.size() ; i++){
            System.out.print(subSet.get(i) + " ");
        }
        System.out.println();
    }

    public static void combin(int n , ArrayList<Integer> subSet){

        if(n==0){
            printarray(subSet);
            return;
        }

        //including n
        subSet.add(n);
        combin(n-1 , subSet);

        //Excluding n
        subSet.remove(subSet.size()-1);
        combin(n-1 , subSet);
    }

    public static void main(String []args){

        Scanner sc= new Scanner (System.in);

        int n = sc.nextInt();
        

        combin(n, new ArrayList<Integer>());


    }
}