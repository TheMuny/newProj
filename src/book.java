
public class book {

	// создем пол€ класса типа стринг
	  String name;
	  String author;
	
	
	}

	
	 class bookTestDrive extends book{
	public static void main(String[] args){
		
		
		
	    book[]B = new book[3];// создаем массив на 3 секции
	    B[0] = new book();// ложим в массив обьекты класса бук
	    B[1] = new book(); 
	    B[2] = new book();
	    
		B[0].name = "книга 1"; // метод который работает с полем name
		B[1].name = "книга 11";  /** пример Ќаследовани€*/
		B[2].name = "книга 1111";
		
		B[0].author = "-- theMuny"; // метод который работает с полем author
		B[1].author = "-- theMuny"; /** пример Ќаследовани€*/
		B[2].author = "-- theMuny";
		int x = 0; // переменна€ счетчик дл€ цикла
		while(x<3){ // цикл который выводит на консоль им€ и автора объекта
			System.out.println(B[x].name+" " + " "+B[x].author );
			x++;
		}
	}
}