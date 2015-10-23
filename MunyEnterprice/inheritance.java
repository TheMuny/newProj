
public class inheritance {

	public int i;
		
	void set(int set){// method set
		i = set;
	}
	public int get(){// method get
	  return i;
	}
}
//................................................................

class inheritanceTestDrive extends inheritance{//create subclass inheritanceTestDrive 
	public static void main(String[] args){
	  inheritanceTestDrive in = new inheritanceTestDrive();/*
	  create an object*/
	  
	  in.set(2525);// realisation method from supperclass - inheritance
	  in.get();    // realisation method from supperclass - inheritance
	  System.out.println(in.get());
	  
	}
}