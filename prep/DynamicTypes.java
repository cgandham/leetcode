package prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicTypes {
	
	//using generic
	public static <T> T getFirst(List<T> list) {
	    if (list.isEmpty()) {
	        return null;
	    } else {
	        return list.get(0);
	    }
	}
	
	//using Object - type erasure
	// ? - wildcard for any datatype
	public static void printList(List<?> list) {
	    for (Object elem : list) {
	        System.out.println(elem);
	    }
	}
	


	public static void main(String[] args) {
		List<Integer> intList = new ArrayList(Arrays.asList(1, 2, 3));
		List<String> stringList = new ArrayList(Arrays.asList("a","b", "c"));
		
		//call generic
		System.out.println(getFirst(intList));
		System.out.println(getFirst(stringList));
		
		System.out.println("-----------");
		
		//call erasure type
		printList(intList);
		printList(stringList);
		
		System.out.println("-----------");
		
		//using Reflection
//		Class<?> clazz = Class.forName("DynamicTypes");
//        Object obj = clazz.newInstance();

	}

}
