package prep;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Adapter");
		System.out.println("");
		
		A a = new A();
		B b = new B();
		a.staticTest();
		b.staticTest();
		
		a.checkOveride();
		b.checkOveride();
		b.hi();
		
		System.out.println(b.checkFinally());
        
		        

		
		//IndiaplugAdapter indiaAdapter = new IndiaplugAdapter(indiaPlug);
		

	}

}
