package IceCreamFactory;

import java.util.Random;

public class Main {

	
	private static IceCream iceCream;
	private static  String[] colors={"brown","red","green"};
	private static  String[] taste = {"strawberry","mint","chocolate"};
	
	public static void cteateIceCream(String color,String taste){
		//Потом попытатся при помощи фабричного метода создать мороженное и отдать его ребенку. 	
		iceCream  = new IceCream(color,taste,new Random().nextInt(6),new Random().nextInt(6));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Children Sindy = new Children("red","strawberry",3,5,"Sindy");
		Children Jhon = new Children("green","mint",1,2,"Jhon");
		Children Barbara = new Children("brown","chocolate",2,4,"Barbara");
		
		
		while(true){
		    int s = new Random().nextInt(colors.length);
		    int t = new Random().nextInt(taste.length);
			cteateIceCream(colors[s],taste[t]);
		//  System.out.println(s+" "+t);
		try {			
			Sindy.acceptIceCream(iceCream);
			System.out.println("Sindy says  <<Thank you so much, it is my favourite ice cream>>");
			break;
		}catch (Exception e){ 			
			System.out.println("Sindy says  <<go to hell. I don't like this shit>>");
			try{
				Jhon.acceptIceCream(iceCream);
				System.out.println("Jhon says  <<Thank you so much, it is my favourite ice cream>>");
				break;
			}catch(Exception e1){
				System.out.println("Jhon says  <<go to hell. I don't like this shit>>");
				try{
					Barbara.acceptIceCream(iceCream);
					System.out.println("Barbara says  <<Thank you so much, it is my favourite ice cream>>");
					break;
				}catch(Exception e2){
					System.out.println("Barbara says  <<go to hell. I don't like this shit>>");
					System.out.println("Children dont  like your ice cream");
			     	}
				}
			}			
		}
	}	
}
			

		


