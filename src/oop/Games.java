package oop;



public class Games {
	
	String name;
	String cdtype;
	String gametype;
	int price;
	
	
	public void gamestart(String click){
		
		if(click=="new game") {
			System.out.println("the game has stared");
		}else {
			System.out.println("the game has not started ");
		}
		
		
	}
	
	public void print() {
		System.out.println(name);
		System.out.println(cdtype);
		System.out.println(gametype);
		System.out.println(price);
	
		
		
	}
}
