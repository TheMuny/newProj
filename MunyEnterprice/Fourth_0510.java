public class Fourth_0510 {

	private double d;
	


	 public double getD() {		 
		return d;
	}


	public void setD(double d) {
		this.d = d;
		}
	
	
	
    	void  calc() {
		int a0 = (int)(d*1000000);
		
		int a1 = a0 % 10;		
		int a2 = (a0/10) % 10;
		int a3 = (a0/100%10);
		int a4 = (a0/1000%10);
		int a5 = (a0/10000%10);
		int a6 = (a0/100000%10);
		int a7 = (a0/1000000%10);
		int a8 = (a0/10000000%10);
		int a9 = (a0/100000000%10);
		System.out.println(a9+a8-a7+a6-a5+a4-a3+a2-a1);
     
        }
}