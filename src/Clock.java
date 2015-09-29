
public class Clock {
	//сеттеры и геттеры
	String time;
	
	void settime(String t){
		time = t;
		
	}
	 String gettime(){	/*в геттере тип возвращаемого значения	  
	      пишется перед
		  объявлением метода */
		
		return time;
	}
}
	class ClockTestDrive{
		public static void main(String[] args){
			Clock C = new Clock();
			C.settime("12:12");
			String tod = C.gettime();
			System.out.println("Время - " + tod);
		}
	}

