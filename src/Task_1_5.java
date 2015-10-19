
public class Task_1_5 {

	public static void main(String[] args) {
		
		//additionalTask5	with array from task1
		int ten_twenty =0;
		int twenty_thirty=0;
		int thirty_forty=0;
		int forty_fifty=0;
	    
		
        //task1	
		
		int [][]ar = new int[8][5];
		for (int i = 0;i<8;i++){
			for(int j =0;j<5;j++){
				do{
				ar[i][j]=(int)(Math.random()*100);
				//System.out.println(ar[i][j]);
				}
				while(ar[i][j]<10);
				System.out.println("task1_ArrayValueCells - "+ar[i][j]);
				if(ar[i][j]>10&&ar[i][j]<20){
					ten_twenty++;
				}else if(ar[i][j]>20&&ar[i][j]<30){
					twenty_thirty++;
				}else if(ar[i][j]>30&&ar[i][j]<40){
					thirty_forty++;
				}else if(ar[i][j]>40&&ar[i][j]<50){
					forty_fifty++;
				}
			}
		}	
		System.out.println("\n\radditionalTask5	with array from task1\n\rten_twenty - "+ten_twenty);
		System.out.println("twenty_thirty - "+twenty_thirty);
		System.out.println("thirty_forty - "+thirty_forty);
		System.out.println("forty_fifty - "+forty_fifty+"\n\r");
		
		//task2
		
		  int countt=0;
		   for(int j=0;j<3;j++){
		    
		    for(int k=0;k<10;k++){
		    
		     for(int l=0;l<6;l++){
		      
		      for(int p=0;p<10;p++){
		       if(j==p&&k==l){
		    	   if((j==2&&p==2)&&(k==4&&l==4)||(j==2&&p==2)&&(k==5&&l==5)){
		    		   break;
		    	   }
		    	   System.out.println(j+""+k+" "+l+""+p);
		    	   countt++;
		    	  
		       }
		      }
		     }
		    }
		   }
		  System.out.println("task2 symmetric numbers - "+countt);
		
		
		// task3
		int countOfmaxValue=0;
		int max=0;
		int nonEmpty[] = new int [10];
		for(int i =0;i<nonEmpty.length;i++){
			nonEmpty[i]=(int)(Math.random()*10);
			if(max<nonEmpty[i]){
				max=nonEmpty[i];			
			}
		}		
		for(int i=0;i<nonEmpty.length;i++){
			if(max==nonEmpty[i]){
				countOfmaxValue++;
			}
		}
		System.out.println("\ntask3 - countOfMaxValue - "+countOfmaxValue);
		System.out.println("\ntask4 - reverse array");
		//task4
		for(int i =0, j=9;i<nonEmpty.length;i++,j--){			
			System.out.println(nonEmpty[i]+" "+nonEmpty[j]+" ");
			
		}
		
		//task5 
		int [][]randomArray = new int [(int)(Math.random()*10)][(int)(Math.random()*10)];
		for(int i=0;i<randomArray.length;i++){
			for(int j =0;j<randomArray[i].length;j++){
				randomArray[i][j]=(int)(Math.random()*10);				
			  }
			}
		System.out.println("\ntask5 - "+ randomArray+"\n\r");		  
	}

}
