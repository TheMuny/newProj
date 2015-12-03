package task;

public class Obj {

	
		private String name;
	    private boolean	isAlive;
		private int health;
		private int attack;
		private int cost;
	
	
		
		Obj(){
			this("dsf",true,5,5,5);
		}
		Obj(String name,boolean	isAlive,int health,int attack,int cost){
			this.name = name;
			this.isAlive = isAlive;
			this.health = health;
			this.attack = attack;
			this.cost = cost;
		}
		
		public int compareTo(Obj o) {
	        String name = getName();
	        String targetName = o.getName();
	        return name.toLowerCase().compareTo(targetName.toLowerCase());
	    }

		
		public String getName() {
			return name;
		}
		public boolean isAlive() {
			return isAlive;
		}
		public int getHealth() {
			return health;
		}
		public int getAttack() {
			return attack;
		}
		public int getCost() {
			return cost;
		}
		
		
}
