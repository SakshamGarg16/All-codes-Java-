import java.util.*;


class practice2{

    

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        System.out.println("Enter  elements");
        List<Integer> M =  new ArrayList<>();
        for(int i =0 ; i<n ; i++)
        M.add(sc.nextInt());

        List<Integer> M1 =new ArrayList<>();

        int t = sc.nextInt();


        for( int i= 0 ; i < n; i++){
            if(M.get(i)<= t){

                M1.add(M.get(i));
               
            }
        }

        System.out.println(M1);
    }


        
    // public static void main(String args[]){
    //     LinkedList <String> ab = new LinkedList<>();

    //     ab.addFirst("MY");
    //     ab.addLast("NAME");
    //     ab.addLast("is");
    //     ab.addLast("GARG");
    //     ab.addLast("Saksham");

    //     System.out.println(ab + "\n  ..................................");

    //     LinkedList <String> lb  =new LinkedList<>();

    //     for(int i=3 ; i<ab.size() ; i++){
    //         lb.add(ab.get(i));
    //         ab.remove(i);
            
    //     }

    //     for(int i=(lb.size()-1)  ; i>=0;i--){
    //         ab.add(lb.get(i));
    //     }

    //     System.out.println(ab);

    // }


}
