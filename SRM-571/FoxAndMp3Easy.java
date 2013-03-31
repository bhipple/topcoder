import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class FoxAndMp3Easy
{
  public String[] playList(int n)
	{
		String[] ans = new String[Math.min(n, 50)];
		
		String[] songs = new String[n];
		for(int i=0; i<songs.length; i++) {
			songs[i] = (i+1) + ".mp3";
		}
		
		Arrays.sort(songs);
		
		for(int j=0; j<ans.length; j++) {
			ans[j] = songs[j];
		}
		
		
		return ans;
	}
}
