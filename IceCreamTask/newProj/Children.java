package newProj;

public class Children {

	private String name;	
	private String color;
	private String taste;
	private int weight;
	private int  size;
	
	Children(String color,String taste, int weight,int  size){
		this.color=color;
		this.taste=taste;
		this.weight=weight;
		this.size=size;
	}
		
	void acceptIceCream(IceCream iceCream){
		try{
			if(iceCream.getColor()==color&&iceCream.getTaste()==taste){
				System.out.println("i like it. Thank you so much");
			}else{
				throw  new Exception();
				}
		}catch(Exception e){
			System.out.println("i dont like this shit");
		}
	}
}
