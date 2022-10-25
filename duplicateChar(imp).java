import java.util.*;
class duplicateChar{
    static boolean arr[] = new boolean [26];
    public static void Add(String n , int i  , String newstring){
        if(i==n.length()){
            System.out.println(newstring);
            return;
        }
        if(arr[n.charAt(i)-'a']==true){
            Add(n , i+1  , newstring) ;
        }
        else{
            arr[n.charAt(i)-'a']=true;
            Add(n, i+1  , (newstring + n.charAt(i)));
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        
        Add(n , 0  , "");
    }
}