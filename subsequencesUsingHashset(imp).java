import java.util.*;
class subsequencesUsingHashset{
    public static void Add(String n , int i  , String newstring , HashSet<String> set){
       if(i==n.length()){
        if(set.contains(newstring)){
            return;
        }
        else{
            set.add(newstring);
            System.out.println(newstring);
            return ;
        }
       }

       //Included
       Add(n , i+1 , newstring + n.charAt(i) , set);

       //Excluded
       Add(n , i+1 , newstring , set);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        HashSet <String> set = new HashSet<>();
        
        Add(n , 0  , "" , set);
    }
}