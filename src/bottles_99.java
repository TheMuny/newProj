
public class bottles_99 {

	//99 бутылок пива
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 99;
		int count = 1;
		String word = "бутылок пива";
		String word2 = "Возьми одну, пусти по кругу ";
		if(number>count){
			System.out.println(word+ " "+number);
			System.out.println(word2);
		       while (number>count){
				number= number-count;
				System.out.println(word+ " "+number);
				System.out.println(word2);
			}
		       
		}
		
		
	}

}
