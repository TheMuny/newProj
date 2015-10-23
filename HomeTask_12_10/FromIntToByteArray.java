
public class FromIntToByteArray {
	
	public static final byte[] intToByteArray(int value) {
	    return new byte[] {
	            (byte)(value >>> 24),  //first sector of array
	            (byte)(value >>> 16), // second sector of array
	            (byte)(value >>> 8), // third sector of array
	            (byte)value};       //fourth sector of array
	}
	
	public static final int ByteArrayToint(byte[] value) {
	    int c = (int)(value[0]<<24)+(int)(value[0]<<16)+(int)(value[0]<<8)+(int)value[3];
	    return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FromIntToByteArray D = new FromIntToByteArray();
		byte[] converted  =  D.intToByteArray(30);//
		System.out.println(converted);
		int c= D.ByteArrayToint(converted);
		System.out.println(c);
	}
	
}
