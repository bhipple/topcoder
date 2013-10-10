import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;
import java.awt.geom.*;

public class FauxPalindromes
{
	public String classifyIt(String word)
	{
		if(isPalin(word))
			return "PALINDROME";
		else if(isFaux(word))
			return "FAUX";
		else
			return "NOT EVEN FAUX";
	}
	
	public boolean isPalin(String word) {
		int j = word.length() - 1;
		boolean palin = true;
		for(int i=0; i<=j; i++) {
			if(word.charAt(i) != word.charAt(j))
				palin = false;
			j--;
		}
		return palin;
	}
	
	public boolean isFaux(String word) {
		String faux = "";
		
		char prevChar = word.charAt(0);
		faux += prevChar;
		for(int i=1; i<word.length(); i++) {
			if(word.charAt(i) != prevChar) {
				prevChar = word.charAt(i);
				faux += prevChar;
			}
		}
		
		return isPalin(faux);
	}
}
//Powered by [KawigiEdit] 2.0!
