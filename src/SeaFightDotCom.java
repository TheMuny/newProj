
public class SeaFightDotCom {// класс для игры морской бой с массивом вместо Arraylist

	int[] locationCells;
	int numsOfHits = 0;
	
	public void setLocationCells(int[]locs){
		locationCells=locs;
	}
	public String checkYourself(String stringGuess){
		int guess = Integer.parseInt(stringGuess);
		String result = "Мимо";
	
	
	for(int cell : locationCells){
		if(guess == cell){
			result = "Попал";
			numsOfHits++;
			break;
		}		
	}
	if (numsOfHits == locationCells.length){
		result = "Потопил";
	}
	System.out.println(result);
	return result;
	}
}
