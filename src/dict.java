
public class dict {

	void record(){
		System.out.println("запись");
	}
	void play(){
		System.out.println("воспроизведение");
	}
	void fastforward(){
		System.out.println("перемотать вперед");	
	}
	void rewind(){
		System.out.println("пепемотать назад");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dict D1 = new dict();
		D1.fastforward();
		D1.play();
		D1.rewind();
	}

}
