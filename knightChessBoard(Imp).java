import java.util.*;
class knightChessBoard{

 public static void allot(List<List<String>> knightpos ,char Board[][]){
    List<String> temp = new ArrayList<>();
         
    for(int i =0 ; i<Board.length;i++){
      String r="";
      for(int j=0 ; j<Board.length ;j++){
        if(Board[j][i]=='K')
          r+=j;
      }
      temp.add(r);
    }
    knightpos.add(temp);
  }
     
  public static boolean isSafe(char Board[][],int row , int col){
    //vertically down rigth
    int r=row;
    for(int c=col ; c<Board.length && r<Board.length ; r=r+2 , c++){
      if(Board[r][c]=='K')
        return false;
    }
         
    //vertically down left
    r=row;
    for(int c=col ; c>=0 && r<Board.length ; r=r+2 , c--){
      if(Board[r][c]=='K')
        return false;
      }
         
    //vertically up rigth
    r=row;
    for(int c=col ; c<Board.length && r>=0 ; r=r-2 , c++){
      if(Board[r][c]=='K')
        return false;
    }
             
    //vertically up left
    r=row;
    for( int c= col ; c>=0 && r>=0 ; r=r-2 , c--){
      if(Board[r][c]=='K')
        return false;
    }
             
    //Horizontally right up
    r=row;
    for(int c = col ; c<Board.length && r>=0 ; r-- , c=c+2){
      if(Board[r][c]=='K')
        return false;
    }
         
    // Horrizantally right down
    r=row;
    for(int c=col ;c<Board.length && r<Board.length ; r++ , c=c+2){
      if(Board[r][c]=='K')
        return false;
    }
         
    //Horrizantally left up
    r=row;
    for( int c =col ; c>=0 && r>=0 ; r-- , c=c-2){
      if(Board[r][c]=='K')
        return false ;
    }
         
    //Hori left down
    r=row;
    for( int c=col ; c>=0 && r<Board.length ; r++ , c=c-2){
      if(Board[r][c]=='K')
        return false;
    }
    return true;
  } 
    
  public static void Helper(List<List<String>> knightpos ,char Board[][] , int n , int col , int row ){
    if(n==col){
      allot(knightpos, Board);
       return;
    }
        
    for(row =0 ; row<Board.length ; row++){
      if(isSafe(Board , row,col)){
        Board[row][col]='K';
        Helper(knightpos, Board, n, col+1, row);
        Board[row][col]='.';
      }
    }
        
  }
    
    public static List<List<String>> knightChessboard(int n) {
    char Board[][]=new char[n][n];
    List<List<String>> Knigthpos = new ArrayList<>();
    
    Helper(Knigthpos , Board , n , 0 , 0);
    
    return Knigthpos ;

    }

  public static void main(String args[]){
    Scanner sc= new Scanner (System.in);

    System.out.println("Enter Board Size");

    int n=sc.nextInt();

    System.out.println(knightChessboard(n) + " ");
    
    
  }
}
