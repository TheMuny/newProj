
public class smallHouse extends Building {

	@Override//annotation override here we change method of superclass
	public int getHeight() {
		if(height <= 5){
		System.out.println(height+" - this is smallHouse");
		}else{
		System.out.println("Height = " + height + " high for smallHouse :-/ ");
		}
		return height;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		smallHouse S = new smallHouse();// create new object 
		S.setHeight(6);//set stage in our building
		S.getHeight();// get stage in our building
		
	}


}
