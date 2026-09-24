class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<HashSet<Character>>rows = new ArrayList<>();
        List<HashSet<Character>>cols = new ArrayList<>();
        List<HashSet<Character>>boxs = new ArrayList<>();
        for(int i =0 ; i<9 ; i++){
        rows.add(new HashSet<>());
        cols.add(new HashSet<>());
        boxs.add(new HashSet<>());
        }
        
        for(int i =0 ; i<board.length ; i++){
            for(int j =0 ; j <board[i].length ; j++){
                if(board[i][j]=='.')   
                    continue ;
                 int box = (i / 3) * 3 + (j / 3) ;
                 if(rows.get(i).contains(board[i][j])||cols.get(j).contains(board[i][j])||boxs.get(box).contains(board[i][j]))
                    return false ;
                rows.get(i).add(board[i][j]);
                cols.get(j).add(board[i][j]);
                boxs.get(box).add(board[i][j]);
                
            }
        }
        
        return true  ;
    }
}
