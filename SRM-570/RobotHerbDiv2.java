import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class RobotHerbDiv2
{
  public int getdist(int T, int[] a)
	{
		int posX = 0;
		int posY = 0;
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		int dir = 0;
		
		for(int k=0; k<T; k++) {	
			for(int i=0; i<a.length; i++) {
				posX += dx[dir] * a[i];
				posY += dy[dir] * a[i];
				
				dir = (dir + a[i]) % 4;
			}
		}
		return Math.abs(posX) + Math.abs(posY);
	}
}
