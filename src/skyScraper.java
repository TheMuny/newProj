
public class skyScraper extends Building{

	@Override//annotation override here we change method of superclass
	public int getHeight() {//change
		if(height>5){
		System.out.println(height+" - this is skyScraper");}
		System.out.println("Height = " + height);
		return height;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		skyScraper S = new skyScraper();// create new object 
		S.setHeight(15);//set stage in our building
		S.getHeight();// get stage in our building
		
	}

}
