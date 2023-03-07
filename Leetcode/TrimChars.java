package Leetcode;

public class TrimChars {
	
	public static String trim(String str, int k){
		StringBuilder res = new StringBuilder();
		int i=0;
		int j=0;
		while(i<str.length()) {
			j = i+1;
			while(j< str.length() && str.charAt(i) == str.charAt(j)) {
				j++;
			}
			if(j-i+1 > k) {
				// add char for k times
//				for(int m = 0; m < k; m++)
//				  res.append(str.charAt(i));
				
				String trimmedString = str.substring(i, i + k);
				res.append(trimmedString);
				
				i = j-1;
			}
			else
				res.append(str.charAt(i));
			i++;
		}
		return res.toString();
	}

	public static void main(String[] args) {
		System.out.println(trim("aaabc", 2));
		System.out.println(trim("aaaabbbbcc", 1));
	}

}
