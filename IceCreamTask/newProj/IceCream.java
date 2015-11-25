package newProj;

public class IceCream {

	private String color;
	private String taste;
	private int weight;
	private int  size;
	
	
	public String getColor() {
		return color;
	}
	public String getTaste() {
		return taste;
	}
	public int getWeight() {
		return weight;
	}
	public int getSize() {
		return size;
	}
	
	
	
	IceCream(){
		this.color  = "white";
		this.taste  = "milky";
		this.weight = 5;
		this.size   = 1;
	}
	IceCream(String color,String taste,int weight,int size){
		this.color  = color;
		this.taste  = taste;
		this.weight = weight;
		this.size   = size;
	}
}
