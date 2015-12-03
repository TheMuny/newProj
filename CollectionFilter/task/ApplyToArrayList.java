package task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;




public class ApplyToArrayList {	
	
	
	static List<Obj> myList;;
	static String s[]= {"Mage","Warrior","Shaman","Priest","Hunter","Rogue"};
	
	
	
    private static final Comparator<Obj> by_NAME = new Comparator<Obj>() {
        @Override
        public int compare(Obj o1, Obj o2) {
            if(o1.getName().equalsIgnoreCase(o2.getName())) {
                System.out.println(o1.getName() +" "+ o2.getName());
                return 0;
            } else if(o1.getName().indexOf(o2.getName()) == 0  ||
                    o2.getName().indexOf(o1.getName()) == 0) {
                System.out.println(o1.getName() +"  1  "+  o2.getName());
                return 0;
            } else {
                return o1.compareTo(o2);
            }
        }
    };
	
	
	public static void main(String[] args){
		
		ApplyToArrayList L = new ApplyToArrayList();
		myList =  new LinkedList();
		myList =  new ArrayList();
		for(int i=0;i<20;i++){			
			int v = new Random().nextInt(6);		
			
	     	L.myList.add(new Obj(s[v]));
	     //	System.out.println(L.myList.get(i).getName());
	     	}
     //    L.myList.sort(by_NAME);
	       List list =  L.myList.stream().sorted(by_NAME).collect(Collectors.toList());	       
	       myList = list;
	       ArrayList s = new ArrayList();
	       
	}
}
