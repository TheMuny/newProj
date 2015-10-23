
public class First_0210 {
	
	private double d;
	 

	 public double getD() {		 
		return d;
	}


	public void setD(double d) {
		this.d = d;
		
		
	}

	public void  plusAll(){// method of obtaining first, second  and last digit
		
		double a1 = d*100;		// move dot to 2 step
		int a2 = (int)a1;
		
		int a = (int)d;//first digit
		
		int b = a2/ 10 % 10;// second digit
		
		double c1 = (d*100)%10;// third digit
		int c = (int)c1;
		
		System.out.println(a+b+c);
	}
}
