package prep;

public class B extends A implements B_Interface {
//	static void staticTest() {
//		System.out.println("Static B");
//	}

	void checkOveride() {
		System.out.println("Override B");
	}
	
	@SuppressWarnings("finally")
	int checkFinally() {
		int res = -1;
		try {
			int ta=1;
			System.out.println("try block");
			res = 11;
			return ta;
			//return 0;
		}
		catch(Exception ex) {
			System.out.println("catch block");
		}
		finally {
			System.out.println("finally block");
			
			return res;
		}
	}

	@Override
	public void hi() {
		// TODO Auto-generated method stub
		System.out.print("hi in B");
	}

	@Override
	public void AInterfaceMetod() {
		// TODO Auto-generated method stub
		
	}
}
