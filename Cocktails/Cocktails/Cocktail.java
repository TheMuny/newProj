package Cocktails;

public class Cocktail {

	private final String color;
	private final String taste;
	private final int alcohol;
	
	
	public String getColor() {
		return color;
	}
	public String getTaste() {
		return taste;
	}
	public int getAlcohol() {
		return alcohol;
	}
	
	Cocktail(){
		this("yellow","lemon",0);
	}
		
	Cocktail(String color,String taste,int alcohol){
		this.color=color;
		this.taste=taste;
		this.alcohol=alcohol;
	}
}
