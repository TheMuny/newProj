
public class generator_slov {

	/**
	 * генератор фраз из трех слов
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] massive1 = {" 1dd"," 2ss"," 3aa"," 4dd"};
		String[] massive2 = {" dfgdfg"," vcfgejejf","  fefjejem"," rjeejqj"};
		String[] massive3 = {" dfgdg"," dfdddhjjfg","  sgs"," sdf"};
		double randomslot = Math.random()*massive1.length;
		double ceplyalka2 = Math.random()*massive2.length;
		double ceplyalka3 = Math.random()*massive3.length;
		
		int znachenie =(int) (randomslot);
		int znachenie1 =(int) (ceplyalka2);
		int znachenie2 =(int) (ceplyalka3);
		
		System.out.println(massive1[znachenie]+massive2[znachenie1]+massive3[znachenie2]);
	}

}
