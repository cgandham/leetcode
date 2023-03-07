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
        
		A_Abstract aAbstract = new A_Abstract() {
			
			@Override
			void hi() {
				// TODO Auto-generated method stub
				
			}
		};
		aAbstract.hello();
		 
		A_Interface aInterface = null;
		
		System.out.println('2' + '2');

	}

}
