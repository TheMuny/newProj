
public class Second_0210 {
	
	 private double d;

	 public double getD() {		 
		return d;
	}


	public void setD(double d) {
		this.d = d;
		
		
	}

	 public void  fisrtAndSecond(){// method of obtaining first and last digit
		 
//		double a1 = d*100;		// move dot to 2 step
//		int a2 = (int)a1;//  
		
		int a = (int)d;//the first  digit
		
//		int b = a2/ 10 % 10;// the second digit
		
		double c1 = (d*100)%10;// the third digit
		int c = (int)c1;
		
		System.out.println(a+" and "+c);
	}
}
