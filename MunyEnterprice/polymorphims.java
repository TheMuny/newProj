
public class polymorphims {

	/**
	 * @param args
	 */
	void go(int x, int y){ //method integer parameters
		System.out.println(" движемся - " + x + " " + y + " " );
	}
	
	void go(String value){//same name, but we used string
		System.out.println(" движемся - " + value );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
 		
		polymorphims P = new polymorphims();
		P.go(10,29);      // one name - two implementations
		P.go("вперед ");
		
	}

}
