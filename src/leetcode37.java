public class leetcode37 {
    public void solveSudoku(char[][] board) {
        solut(board);
    }
    private boolean solut(char[][] board){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(".".equals(board[i][j])){
                    for (char c='1';c<='9';c++){
                        if(isVaild( i,j,board,c)){
                            board[i][j]=c;
                            if(solut(board)){
                                return true;
                            }else {
                                board[i][j]='.';
                            }
                        }

                    }

                }
                return false;
            }

        }
        return true;
    }
    private boolean isVaild(int i,int j,char[][] board,char c){
        for (int k = 0; k < 9; k++) {
            if(board[i][k]!='.'&&board[i][k]==c){
                return false;
            }
            if(board[k][j]!='.'&&board[k][j]==c){
                return false;
            }
            if(board[3*(i/3)+k/3][3*(j/3)+k%3]!='.'&&board[3*(i/3)+k/3][3*(j/3)+k%3]==c){
                return false;
            }
        }
        return true;
    }
}
