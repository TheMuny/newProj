
public class bara {

	boolean hats = true;
	boolean drums = true;
	
	void playdrums(){
		System.out.println("bah bah bah");
	}
	void playhats(){
		System.out.println("tin-tin");
	}
}
	class baraTestdrive{
		public static void main(String[] args){
			bara B = new bara();
			
			B.playhats();		
			if (B.drums == true){
				B.playdrums();
				
			}
			B.drums = false;
		}
	}

