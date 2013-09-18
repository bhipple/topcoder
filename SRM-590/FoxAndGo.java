import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class FoxAndGo
{
	boolean[][] processed;
	
	public int maxKill(String[] board)
	{
		int n = board.length;
		int kills = 0;
		int whites = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(board[i].charAt(j) == 'o')
					whites++;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(board[i].charAt(j) == '.') {
					StringBuilder sb = new StringBuilder(board[i]);
					sb.setCharAt(j, 'x');
					board[i] = sb.toString();
					kills = Math.max(kills, whites - calcAlive(board));
					StringBuilder nsb = new StringBuilder(board[i]);
					nsb.setCharAt(j, '.');
					board[i] = nsb.toString();
				}
			}
		}
		return kills;
	}
	
	public int calcAlive(String[] board) {
		int n = board.length;
		int alive = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				processed = new boolean[n][n];
				if(board[i].charAt(j) == 'o' && seeIfAlive(board, i, j)) {
					alive++;
				}
			}
		}
		
		return alive;
	}
	
	public boolean seeIfAlive(String[] board, int i, int j) {
		int n = board.length;
		if(i >=n || j>=n || i<0 || j<0) 
			return false;
		
		if(processed[i][j])
			return false;

		processed[i][j] = true;
		
		if(board[i].charAt(j) == '.') {
			return true;
		}
		
		if(board[i].charAt(j) == 'x') {
			return false;
		}
		
		return seeIfAlive(board, i+1, j) || seeIfAlive(board, i-1, j) || seeIfAlive(board, i, j+1) || seeIfAlive(board, i, j-1);
	}
	
}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
