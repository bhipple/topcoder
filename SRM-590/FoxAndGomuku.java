import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class FoxAndGomoku
{
	public String win(String[] board)
	{
		int n = board.length;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(checkForWin(board, i, j))
					return "found";
			}
		}
		return "not found";
	}
	
	public boolean checkForWin(String[] board, int i, int j) {
		return checkHoriz(board, i, j) || checkVert(board, i, j) || checkDiagA(board, i, j) || checkDiagB(board, i, j);
	}
	
	public boolean checkHoriz(String[] board, int i, int j) {
		int k = 0;
		while(isHit(board, i + k, j)) {
			k++;
		}
		if(k >= 5)
			return true;
		return false;
	}
	
	public boolean checkVert(String[] board, int i, int j) {
		int k = 0;
		while(isHit(board, i, j+k)) {
			k++;
		}
		if(k >= 5)
			return true;
		return false;
	}
	
	public boolean checkDiagA(String[] board, int i, int j) {
		int k = 0;
		while(isHit(board, i+k, j+k)) {
			k++;
		}
		if(k >= 5)
			return true;
		return false;
	}	
	
	public boolean checkDiagB(String[] board, int i, int j) {
		int k = 0;
		while(isHit(board, i-k, j+k)) {
			k++;
		}
		if(k >= 5)
			return true;
		return false;
	}		
	
	public boolean isHit(String[] board, int i, int j) {
		if(i < board.length && i >=0 && j < board.length && j >=0 && board[i].charAt(j) == 'o')
			return true;
		return false;
	}
	

}
//Powered by KawigiEdit 2.1.4 (beta) modified by pivanof!
