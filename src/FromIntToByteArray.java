
public class FromIntToByteArray {
	
	public static final byte[] intToByteArray(int value) {
	    return new byte[] {
	            (byte)(value >>> 24),  //first sector of array
	            (byte)(value >>> 16), // second sector of array
	            (byte)(value >>> 8), // third sector of array
	            (byte)value};       //fourth sector of array
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FromIntToByteArray D = new FromIntToByteArray();
		byte[] converted  =  D.intToByteArray(55);//
				
	}

}
