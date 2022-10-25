import java.util.*;


 
class practice2{

    public static LinkedList<Integer> Reverse(LinkedList<Integer> list , int n ){

        // if(list.get(0) == null)
        // return  ;

        // if(list.next(list.get(0)) == null)
        // return  ;

        LinkedList<Integer> temp = new LinkedList<>();


        for(int i=0 ; i<(list.size());i++){

            if(i%2 != 0){
                temp.add(list.get(i));
                temp.add(list.get(i-1));
            }
        }
        if(list.size() %2 != 0){
            temp.add(list.get(list.size()-1));

        }

        return temp ;
    }

   
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        LinkedList <Integer> list = new LinkedList<Integer>();

        for(int i=0 ; i<n ; i++){

            list.add(sc.nextInt());

        }


        System.out.println(Reverse(list , n ));


    }
}