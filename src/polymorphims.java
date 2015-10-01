
public class polymorphims {

	/**
	 * @param args
	 */
	void go(int x, int y){ //метод с целочисленными параметрами
		System.out.println(" движемся - " + x + " " + y + " " );
	}
	
	void go(String value){//метод со строковым значением
		System.out.println(" движемся - " + value );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
 		
		polymorphims P = new polymorphims();
		P.go(10,29);      // Один метод - 2 разных реализации
		P.go("вперед ");
		
	}

}
