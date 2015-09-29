import java.util.ArrayList; //импортируем объект ArrayList в класс DotCom


public class DotCom {//создание класса дотком
	private ArrayList<String> locationCells;/*объ€вл€ем переменную locationCells 
	как объект класса ArrayList хран€щий значени€ 	типа String */
	
	String NameOfSite;
	public void setLocationCells(ArrayList<String> loc){/* объ€вл€ем метод set c параметром
	идентичным значению locationCells */
		locationCells=loc;// параметр метода принимает аргумент из переменной locationCells
	}
	public String checkYourself(String userInput){/* объ€вл€ем метод get со строковым параметром
	 и типом возвращаемого значени€ String*/
		 
	 String result ="ћимо";/* объ€вл€ем строковую переменную -
	 - результат, со значением по умолчанию "ћимо" */
	 
	 int index = locationCells.indexOf(userInput);/* ќбъ€вл€ем целочисленную переменную
	 index чтобы проверить  значение введенное игроком на наличие в locationCells	 */
	 
	 if (index >=0){//объ€вл€ем ветвление
		 locationCells.remove(index);// из переменной locationCells удал€етс€ значение по индексу
		 if(locationCells.isEmpty()){// если arraylist пуст это было роковое попадание
			 result = "ѕотопил";
			 }else{// если не пуст это было просто попадание
				 result = "ѕопал";
		 }
	 }
	 return result;// возвращаем результат
	}
}
