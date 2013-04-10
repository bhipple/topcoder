import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class PenguinTiles
{
  public int minMoves(String[] tiles)
	{
		boolean bottomRow = false;
		boolean rightColumn = false;
		
		int r = tiles.length;
		int c = tiles[0].length();
		for(int i=0; i<r; i++) {
			if(tiles[i].charAt(c-1) == '.')
				rightColumn = true;	
		}
		
		for(int j=0; j<c; j++) {
			if(tiles[r - 1].charAt(j) == '.')
				bottomRow = true;
		}
		
		if(bottomRow && rightColumn)
			return 0;
		else if(bottomRow || rightColumn)
			return 1;
		else
			return 2;
	}
}
//Powered by [KawigiEdit] 2.0!
