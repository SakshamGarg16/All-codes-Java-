import java.util.*;
class subSequen{
    public static void sequence(String str , String combination ){
        if(str.length()==0){
            System.out.println(combination);
            return ;
        }
        for(int i=0 ; i<str.length() ; i++){
            char currentchar = str.charAt(i) ;
            String newstr = str.substring(0,i) + str.substring(i+1);
            sequence (newstr , (combination + currentchar) );
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        String str = sc.nextLine();

        sequence(str, "" );
    }
}