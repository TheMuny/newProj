
public class skyScraper extends Building{

	@Override
	public double getHeight() {
		if(height>5){
		System.out.println(height+" - this is skyScraper");}
		System.out.println("Height = " + height);
		return height;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		skyScraper S = new skyScraper();
		S.setHeight(15);
		S.getHeight();
		
	}

}
