package IceCreamFactory;

public class IceCream {

	private final String color;
	private final String taste;
	private final int weight;
	private final int  size;
	
	
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
		 this("white", "milky", 5, 1);
	}
	IceCream(String color,String taste,int weight,int size){
		this.color  = color;
		this.taste  = taste;
		this.weight = weight;
		this.size   = size;
	}
}
