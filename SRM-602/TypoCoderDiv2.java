public class TypoCoderDiv2
{
	public int count(int[] rating) 
	{
		int curColor = 0;
			
		int swaps = 0;	
		for(int i=0; i<rating.length; i++) {
			if(curColor == 0 && rating[i] >= 1200) {
				swaps++;
				curColor = 1;
			}
			if(curColor == 1 && rating[i] < 1200) {
				swaps++;
				curColor = 0;
			}
		}
		
		return swaps;
			
	}

}
