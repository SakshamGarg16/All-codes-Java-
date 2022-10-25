import java.util.*;
class NQueens{

    public static void attach(List<List<String>> QBoard , char Board[][]){

        List<String> str = new ArrayList<>();
        
        for(int i=0 ; i<Board.length ; i++ ){
            String r = "";
            for(int j=0; j<Board[0].length ; j++){
                if(Board[j][i]=='Q')
                r+='Q';
                else
                r+='.';
            }
            str.add(r);

        }
        QBoard.add(str);

    }

    public static boolean isSafe(char Board[][] , int row , int col){
        //Horizontal Check
        for(int i=0 ; i<Board.length ; i++){
            if(Board[row][i]=='Q'){
                return false;
            }
        }

        //vertical
        for(int i=0 ; i<Board.length ; i++){
            if(Board[i][col]=='Q'){
                return false;
            }
        }

        //upper Left hori
        int r=row;
        for(int c=col; c>=0 && r>=0 ; c-- , r--){
            if(Board[r][c]=='Q'){
                return false ;
            }
        }

        //upper right hori
        r=row;
        for(int c=col ; c<Board.length && r>=0 ; c++ , r--){
            if(Board[r][c]=='Q'){
                return false;
            }
        }

        //Lower left hori
        r=row;
        for(int c=col ; c>=0 && r<Board.length ; r++ , c--){
            if(Board[r][c]=='Q'){
                return false;
            }
        }

        //Lower rigth hori
        for(int c=col ; c<Board.length && r<Board.length ; r++,c++){
            if(Board[r][c]=='Q'){
                return false;
            }
        }

        return true ;
    }

    public static void allot(List<List<String>> QBoard , char Board[][] , int row , int col , int n ){
        if(col==n){
            attach(QBoard , Board);
            return ;
        }
        for(row=0 ; row<Board.length ; row++){
            if(isSafe(Board , row , col)){
                Board[row][col]='Q';
                allot(QBoard, Board, row, col+1 , n);
                Board[row][col]='.';
            }
        }
    }

    public static List<List<String>> SolveNQueen(int n){
        List<List<String>> QBoard = new ArrayList<>();

        char Board[][]=new char [n][n];

        allot(QBoard , Board , 0 , 0 , n);

        return QBoard ;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        System.out.println(SolveNQueen(n) + "\n");
    }
}