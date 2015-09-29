
public class inheritance {

	public int i;
		
	void set(int set){// метод класса
		i = set;
	}
	public int get(){// метод класса
	  return i;
	}
}
//................................................................

class inheritanceTestDrive extends inheritance{//создаем подкласс inheritanceTestDrive 
	public static void main(String[] args){
	  inheritanceTestDrive in = new inheritanceTestDrive();/*
	  создание объекта класса inheritanceTestDrive*/
	  
	  in.set(2525);// реализация метода из класса inheritance
	  in.get();    // реализация метода из класса inheritance
	  System.out.println(in.get());
	  
	}
}