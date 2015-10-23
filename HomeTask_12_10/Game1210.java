import java.util.Scanner;


public class Game1210 {

	Scanner sc = new Scanner(System.in);
	double num = Math.random()*100;
    private int number = (int)num;
  
   
	public void play() {
		int count=7;
		boolean b= false;
		
        do{		
		int is= userGuess();    	   
    	  
	    if(is==number){
	    	System.out.println("Congratulation you are winner !!!");
	    	b=true;	    	
	    }
	    else if(is>number){
	    	count--;
	    	System.out.println(" - too much");
	    	System.out.println("It left - "+count+" attempts");	    	
	    }
	    else if(is<number){
	    	count--;
	    	System.out.println(" - not enough");
	    	System.out.println("It left - "+count+" attempts");	    	
	        }
	    }

        while(b!=true && count!=0);
	}	

    public int userGuess(){    	
  
    	boolean test = false;
        int userGuess = 0;
    	do{
        Scanner sc = new Scanner(System.in);
    	if(sc.hasNextInt()){
        userGuess = sc.nextInt();
        test=true;}
    	else System.out.println("Enter the number...");}
    	while(test!=true);
    	return userGuess;
    }

	public static void main(String[] args) {
		

		Game1210 G = new Game1210();
		G.play();
	}

}
