
public class encapsulation {
	
	private int i; //here we choose modifier private

void set(int now){// get and set methods
	i=now;
}
  int get(){
	  return i;
  }
}


class encapsulationTestDrive {// class starter
	public static void main(String[] args){
		encapsulation en = new encapsulation();//create new object
		en.set(6);// set variable
		System.out.println(en.get()); // realisation of encapsulation.
		//variable is available only from method get
	
	}
}