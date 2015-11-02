
public class WraperTest implements wrapperI{
   
	 static int [] Array = new int [1];
	
	public WraperTest(){
		for(int i=0;i<Array.length;i++){
			Array[i]=(int)(Math.random()*100);
		}
	}
	
	public int getValue(int index) {
		System.out.println(Array[index]);
		return Array[index];	
		/*Show element on index*/
	}

	public void addElement(int value) {
		Array[Array.length-1]=value;	
		int[] b = new int[Array.length+1];
		System.arraycopy(Array,0,b,0,Array.length);
		Array=b;
		/*Add element to storage*/
	}

	public void removeIndex(int index) {
		
		int[] b = new int[Array.length-1];
		int s=0;
		for(int i=0;i<Array.length;i++){
			b[s]=Array[i];
			if(index==Array[index]||s<b.length){			
				s--;
			}			
			s++;
		}	
		Array=b;	
		/*Remove element from storage in index*/
	}
	
	public void removeValue(int value) {
		int count = 0;
		
		for(int i=0;i<Array.length;i++){
			if(value==Array[i]){
				count++;			
			}
		}		
		int[] b = new int[Array.length-count];
		int s=0;
		for(int i=0;i<Array.length;i++){
			if(value!=Array[i]&&s<b.length){			
				b[s]=Array[i];
				s++;
			}			
		}	
		Array=b;
		/*Remove all elements from storage on value*/
	}
	
	public int min() {
		int min=Array[0];
		for(int i=0;i<Array.length-1;i++){
			if(min>Array[i]){
				min=Array[i];
			}
		}
		return min;
		/*Get min value from storage*/
	}

	public int max() {
		int max=0;
		for(int i=0;i<Array.length;i++){
			if(max<Array[i]){
				max=Array[i];
			}
		}
		return max;
		/*Get max value from storage*/
	}

	public double avg() {
		int  countofelements=0;
		double  sum =0;		
		for(int i=0;i<Array.length;i++) {
			sum=sum+Array[i];
			countofelements++;
		}		
	//	System.out.println(sum);
		return sum/(countofelements-1);
		/*Get arithmetical mean from storage*/
	}


	
	public static void main(String[] args) {
    	WraperTest WraperTest = new WraperTest();
//		System.out.println(Array[0]);
 //    	WraperTest.startInitialization();
//		System.out.println(Array[0]);
//		WraperTest.addElement(5);
//		System.out.println(Array[0]);
//		WraperTest.removeValue(5);
//		System.out.println(Array[0]);
//		WraperTest.addElement(5);
//		System.out.println(Array[0]);
//		WraperTest.removeValue(5);
//		System.out.println(Array[0]);
//		WraperTest.addElement(5);
//		System.out.println(Array[0]);
//		WraperTest.addElement(5);
//		WraperTest.addElement(6);
//		WraperTest.addElement(2);
//		WraperTest.addElement(126);
//		WraperTest.addElement(3);
//		WraperTest.addElement(19);
//		WraperTest.addElement(9);
//		
//		System.out.println(WraperTest.avg());
//		System.out.println(WraperTest.max());
//		System.out.println(WraperTest.min());
//    	System.out.println();
    	WraperTest.getValue(0);
    	
	}

	

}
