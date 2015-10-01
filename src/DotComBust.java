import java.util.*;
public class DotComBust {
	
	
	  private int numOfGuesses = 0;// переменная количества ходов
	  private ArrayList<DotCom> DotComList = new ArrayList<DotCom>(); //Создаем ArrayList - DotComlist
	  private GameHelper helper = new GameHelper();// Создаем объект класса  GameHelper
	  
	  
	  
	  void setUpGame(){
		  DotCom D1 =new DotCom();          // создаем объект класса DotCom
		  D1.NameOfShip = "первый корабль"; // присваиваем имя объекту (кораблю)
		  DotCom D2 =new DotCom();
		  D2.NameOfShip = "второй корабль";
		  DotCom D3 =new DotCom();
		  D3.NameOfShip = "третий корабль";
				  
		  DotComList.add(D1);         // вкладывает объекты DotCom в DotComList
		  DotComList.add(D2);
		  DotComList.add(D3);
		  
		  System.out.println("Цель: потопить 3 корабля а минимальное колличество ходов");/*
		  Выводим на консоль краткий инструктаж к игре*/
		  
		  for(DotCom DotComToSet: DotComList){// повторяем с каждым объектом DotCom в DotComList'e
		  ArrayList<String> newLocation = helper.placeDotCom(3);// запрашиваем у helper'a адресс коробля
		  DotComToSet.setLocationCells(newLocation);/* Вызываем сеттер из объекта DotCom
		  чтобы передать ему рассположение клекти которое только что получили от  объекта helper*/
		  }
	  }
	  
	  
	  
	  void startPlaying(){
		  while(!DotComList.isEmpty()){// До тех пор пока список объектов DotCom не станет пустым
			  String userGuess = helper.getUserInput("Сделайте ход!!!");// получаем пользовательский ход
			  checkUsersGuess(userGuess);// вызываем метод проверки хода игрока
		  }
		  finishGame();// вызываем метод заканчивающий игру
	  }
	  
	  void checkUsersGuess(String userGuess){
		  
		  numOfGuesses++;//инкременируем переменную количества ходов		  
		  String result = "Мимо";// создаем локальную строковую переменную - результат мимо		  
	      for(DotCom DotComToTest : DotComList){ //повторяем с каждым объектом DotCom в DotComList'e
		  result = DotComToTest.checkYourself(userGuess);/*проверяем ход пользователя 
		  ищем попадание или потопление */
		  
		  if(result.equals("Попал")){// тут ничего нет.. вообще можно было не писать условие
			  break;// мгновенно выходим из цикла
		  }
		  if(result.equals("Потопил")){
			  DotComList.remove(DotComToTest);//удаляем объект DotCom из списка DotComList
			  break;// мгновенно выходим из цикла
		  }
	  }  
	  System.out.println(result);// выводим результат в чат
	  }
	  
	  void finishGame(){// выводим завершающие сообщение об окончании игры
		  System.out.println("Все корабли потоплены!");
		  if(numOfGuesses<=18){
			  System.out.println("Это заняло у тебя всего" + numOfGuesses + "попыток");
		  }else{
			  System.out.println("Это заняло у тебя много времени и больше 18 попыток");
		  }
	  }

	
	public static void main(String[] args) {
		// запуск игры в главном методе

		DotComBust Bust = new DotComBust();// создаем игровой объект 
		Bust.setUpGame(); // запустить метод  сет ап гейм в игре
		Bust.startPlaying();// 	запускаем начало игры
		
		
		
	}

}
