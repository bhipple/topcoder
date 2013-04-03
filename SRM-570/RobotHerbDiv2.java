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
		int[] dir = {0, 1};
		
		for(int k=0; k<T; k++) {
			
			for(int i=0; i<a.length; i++) {
				posX = posX + dir[0] * a[i];
				posY = posY + dir[1] * a[i];
				
				for(int j=0; j<(a[i] % 4); j++) {
					if(dir[0] == 0 && dir[1] == 1) {
						dir[0] = 1;
						dir[1] = 0;
					}
					else if(dir[0] == 1 && dir[1] == 0) {
						dir[0] = 0;
						dir[1] = -1;
					}
					else if(dir[0] == 0 && dir[1] == -1) {
						dir[0] = -1;
						dir[1] = 0;
					}
					else if(dir[0] == -1 && dir[1] == 0) {
						dir[0] = 0;
						dir[1] = 1;
					}
				}
			}
		}
		return Math.abs(posX) + Math.abs(posY);
	}
}
