
public class xCopy {
     
	
	// переменная ориг не изменяется в методе ГО
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int orig=42;
		xCopy x = new xCopy();
		int y = x.go(orig);
		System.out.println(orig + " " + y);
	}

	int go(int arg){
		arg = arg*2;
		return arg;
	}
}
