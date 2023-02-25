package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class DomainString {
	
	private static int getLastIndex(String str) {
		 char ch = '.';
		 int count = 0;
		 int index = -1;
		   
	 for(int i = str.length() - 1; i >= 0; i--) {
		       System.out.println(i);
		    if (str.charAt(i) == ch) {
		      index = i;
		      System.out.println("matched");
		        count++;
		         System.out.println(count);
		        if (count == 2) {
		           System.out.println("matched2");
		            index = i;
		            break;
		        }
		    }
		}
		return index;
		
	}
	
	  public static HashMap<String, Integer> getClicks(String[] counts){
		    HashMap<String, Integer> map = new HashMap<>();
		    for(int i=0;i< counts.length; i++){
		    	
		      int hits = Integer.parseInt(counts[i].substring(0, counts[i].indexOf(",")));
		      String domain = counts[i].substring(counts[i].indexOf(",")+1);    

		      while(domain.length() > 0) {
		    	  map.put(domain, map.getOrDefault(domain, 0) + hits);

		    	  if(domain.indexOf('.') != -1)
		    		  domain = domain.substring(domain.indexOf('.')+1);
		    	  else 
		    		  domain = "";
		      }
		      
//		      int index = getLastIndex(key);
//		      String key = key.substring(index);
	
		    }
		    return map;
		  }

	public static void main(String[] args) {
		String[] counts = {
			      "900,google.com",
			      "60,mail.yahoo.com",
			      "10,mobile.sports.yahoo.com",
			      "40,sports.yahoo.com",
			      "300,yahoo.com",
			      "10,stackoverflow.com",
			      "20,overflow.com",
			      "5,com.com",
			      "2,en.wikipedia.org",
			      "1,m.wikipedia.org",
			      "1,mobile.sports",
			      "1,google.co.uk"
			    };
			    HashMap<String, Integer> res = getClicks(counts);
			    for( Map.Entry<String, Integer> entry : res.entrySet()){
			       System.out.println(entry.getKey() +
			                             " : " + entry.getValue());
			    }

	}

}
