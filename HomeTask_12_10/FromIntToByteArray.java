
public class FromIntToByteArray {
	
	public static final byte[] intToByteArray(int value) {
	    return new byte[] {
	            (byte)(value >>> 24),  //first sector of array
	            (byte)(value >>> 16), // second sector of array
	            (byte)(value >>> 8), // third sector of array
	            (byte)value};       //fourth sector of array
	}
	
	public static final int ByteArrayToint(byte[] value) {
	    int c = (int)value[0]+(int)value[1]+(int)value[2]+(int)value[3];
	    return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FromIntToByteArray D = new FromIntToByteArray();
		byte[] converted  =  D.intToByteArray(55);//
		System.out.println(converted);
		int c= D.ByteArrayToint(converted);
		System.out.println(c);
	}
	
}
//int clock[][] = new int[4][];
//clock[0] = new int[3];
//clock[1] = new int[10];
//clock[2] = new int[6];
//clock[3] = new int[10];
//for (int j = 0; j < 3; j++) {
//    clock[0][j] = j;
//}
//for (int k = 0; k < 10; k++) {
//    clock[1][k] = k;
//}
//for (int l = 0; l < 6; l++) {
//    clock[2][l] = l;
//}
//for (int p = 0; p < 10; p++) {
//    clock[3][p] = p;
//}
//System.out.println(clock[3][8]);	