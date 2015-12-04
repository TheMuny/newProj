package task;



import java.util.List;
import java.util.Random;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ApplyToMap {

	 static  TreeMap<Integer,Obj> M = new TreeMap<Integer,Obj> ();
     static  String[]name = {"a1","a2","a3","b1","b2","b3"};
	 
	public static void main(String[] args) {
		
		
		for(int i=0;i<10;i++){
			int currentName = new Random().nextInt(6);
		    M.put(i, new Obj(name[currentName]));
		}
		
	   List l = M.values().stream().sorted(new ApplyToArrayList().getBy_NAME()).collect(Collectors.toList());
		
		
		
	 }
}
