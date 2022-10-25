import java.util.*;
class practice{

    public static void allot(char Board[][] , List<List<String>> foundPos){
        List<String> temp = new ArrayList<>();

        for(int i=0 ; i<Board.length ; i++){
            String r = "";

            for(int j=0 ; j<Board.length ; j++){
                if(Board[j][i]=='Q')
                r +="Q";

                else
                r += ".";
            }
            temp.add(r);

        }
        foundPos.add(temp);

    }

    public static boolean isSafe(char Board[][] , int row , int col){
        for(int i=0 ; i<Board.length ; i++){
            if(Board[i][col]=='Q')
            return false;

            if(Board[row][i]=='Q')
            return false;
        }

        for(int r=row , c=col ; c>=0 && r>=0 ; r--,c--){
            if(Board[r][c]=='Q')
            return false;
        }

        for(int r=row , c=col ; c<Board.length &&r>=0 ; r--,c++){
            if(Board[r][c]=='Q')
            return false;
        }

        for(int r=row , c=col ; c>=0 && r<Board.length ; r++,c--){
            if(Board[r][c]=='Q')
            return false;
        }

        for(int r=row , c=col ; c<Board.length && r<Board.length ; r++,c++){
            if(Board[r][c]=='Q')
            return false;
        }

        return true;
    }

    public static void Helper(List<List<String>> foundPos , char Board[][] , int row , int col , int n){
        if(col>= n){
            allot(Board , foundPos);
            return ;
        }

        for(row=0 ; row<Board.length ; row++){
            if(isSafe(Board , row , col)){
                Board[row][col]='Q';
                Helper(foundPos, Board, row, col+1 , n);
                Board[row][col]='.';
            }
        }
    }

    static List<List<String>> PosQueen(int n){
        List<List<String>> foundPos = new ArrayList<>();
        char Board[][] = new char [n][n];

        Helper(foundPos , Board , 0 , 0 , n);
        return foundPos;
    }

   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(PosQueen(n));
    }
}