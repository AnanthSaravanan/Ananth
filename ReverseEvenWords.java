package week2.day2.assignment;

import java.util.Iterator;

public class ReverseEvenWords {
public static void main(String[] args) {
	
	String str = "i am writing";
	String[] str2 = str.split(" ");
	String str3 = "";
	String k = "";
	for (int i = 0; i < str2.length; i++) {
		if (i%2 ==0) {
			System.out.println(""+ str2[i] + "");
		} else {
      str3 = str2[i];
      for (int j = str3.length()-1; j>=0; j--) {
    	  k = "" + str3.charAt(j);
    	  System.out.println(k);
		
	}
      str3="";
		}
	}
	
	
	
	
}
}
        
    
    
  

    
			
		
			
		
	


