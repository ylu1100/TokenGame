package com.company;

public class TokenPass {
    private int CurrentPlayer;
    private int[]board;
    public TokenPass(int playercount) {
        int[]board = new int [playercount];
        this.board=board;
        this.CurrentPlayer = (int)(Math.random()*(playercount-1));
        for(int i = 0;i<playercount;i++){
            board[i]=(int)((Math.random()*9)+1);
        }
    }
    public void distributeCurrentPlayerTokens(){
        for(int i = CurrentPlayer+1;i<board.length;i++){
            board[i]++;
            board[CurrentPlayer]--;
        }
        if (board[CurrentPlayer]>0){
            board[0]++;
            board[CurrentPlayer]--;
        }
    }
    public int getCurrentPlayer(){
        return CurrentPlayer;
    }
    public int[] getBoard(){return board;
    }
}
