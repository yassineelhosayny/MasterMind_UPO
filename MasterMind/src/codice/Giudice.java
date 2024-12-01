package codice;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;

public class Giudice {
	public static final int LUNGHEZZA =4;
	public static final int TENTATIVI = 10;
	public static final char[] CHARS= {'0','1','2','3','4','5','6','7','8','9'};
	//static {
	//	CHARS
	//}
    
	public static Boolean valida(String string) {
   	 
    	return(string.length()==LUNGHEZZA) && caratteriGiusti(string) 
    			&& caratteriNonripetuti(string) ;
	}
	
	private static boolean caratteriGiusti(String string) {
    	for(int i=0;i<string.length();i++) {
        	if(!carateriGiusti(string.charAt(i)))
            	return false;
    	}
    	return true;
	}
	private static boolean carateriGiusti(char c) {
    	for(char ch:CHARS) {
        	if(ch==c)
            	return true;
    	}
    	return false;
	}
	
	private static boolean caratteriNonripetuti(String string) {
		char[] stringAr = string.toCharArray();
													// TODO Auto-generated method stub
		for(int i=0;i<string.length()-1;i++) {
			char ch= stringAr[i];
			for(int j=1+i;j<string.length();j++) {
				if(ch == stringAr[j])
					return false;
			}
		}
		return true;
}
	
	
	public static int numBulls(String guess, String target) {
											// TODO Auto-generated method stub
		int count=0;
		
		for(int i=0;i<target.length();i++) {
			if(guess.charAt(i) == target.charAt(i))
				count++;
		}
		return count;
	}

	public static int numMaggots(String guess, String target) {
		int count =0;									// TODO Auto-generated method stub
		
		for (int i = 0;i<target.length();i++) {
			for(int j=0;j<target.length();j++) {
				if(i==j && guess.charAt(i) == target.charAt(j))   
					break;                                // per contare solo i caratteri (numeri) che sono uguali
				                                            // e non si trovano nella stessa posizione (compito di numBulls)
				if(guess.charAt(i) == target.charAt(j) )
					count++;
			}
		}
		return count;
	}
    
       
}
