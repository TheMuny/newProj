
public class smallHouse extends Building {

	@Override
	public double getHeight() {
		if(height <= 5){
		System.out.println(height+" - this is smallHouse");}
		System.out.println("Height = " + height);
		return height;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		smallHouse S = new smallHouse();
		S.setHeight(5);
		S.getHeight();
		
	}


}
