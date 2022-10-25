import java.util.*;

class keypadCombination{

    public static String keypad [] = { "." , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"};

    public static void printKeypadCombi(String str , int idx , String combi ){
        if(idx==str.length()){
            System.out.println(combi);
            return ;
        }
        String currentchar = keypad[str.charAt(idx)-'0'];
        for(int i=0 ; i < currentchar.length() ; i++){
            printKeypadCombi(str, idx+1 , combi + currentchar.charAt(i));

        }
    }

        
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String combi = sc.nextLine();
        printKeypadCombi(combi, 0, "");
    }
}