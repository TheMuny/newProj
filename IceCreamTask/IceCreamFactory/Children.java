package IceCreamFactory;

public class Children {

	private String name;
	private IceCream iceCream;
	
	private String favouritColor;
	private String favouritTaste;
	private int favouritWeight;
	private int  favouritSize;
	
	
	Children(String color,String taste, int weight,int  size,String name){
		this.favouritColor=color;
		this.favouritTaste=taste;
		this.favouritWeight=weight;
		this.favouritSize=size;
		this.name =name;
	}
		
	public void acceptIceCream(IceCream iceCream) throws Exception{	
		
			if(iceCream.getColor()==favouritColor&&iceCream.getTaste()==favouritTaste
					&&iceCream.getWeight()==favouritWeight&&iceCream.getSize()==favouritSize){
				System.out.println(name + " says <<I like it so much>>");
				this.iceCream = iceCream;
			}else{
				throw new Exception();				
			}
		
	}
}
