
public class Second_0210 {
	
	 private double d;

	 public double getD() {		 
		return d;
	}


	public void setD(double d) {
		this.d = d;
		
		
	}

	 public void  minAndMax(){// obtaining min and max digit
	
		 int a0 = (int)(d*100);
		
		
		 int a1 = a0 % 10;	//last	
	   	 int a2 = (a0/10) % 10;
	     int a3 = (a0/100)%10;
		 int a4 = (a0/1000%10);
	   	 int a5 = (a0/10000%10);
		 
		 
		 int [] array = {a5,a4,a3,a2,a1};
		 int max = array[0], min = array[0];
		 
	        for(int i = 0; i<array.length; i++){
	            if(max<array[i])
	                max = array[i];
	            if(min>array[i])
	                min = array[i];
	        
	        }		 
			 System.out.println("min - "+min+" "+"max - "+max);
	}
}
