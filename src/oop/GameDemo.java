package oop;

public class GameDemo {

	public static void main(String[] args) {
		
		Games game1= new Games();
		game1.name="call of duty";
		game1.cdtype="ps4";
		game1.gametype="shooter";
		game1.price=20;
		
		Games game2= new Games();
		game2.name="forza horizn";
		game2.cdtype="xbox";
		game2.gametype="racing";
		game2.price=35;
		
		game1.print();
		game1.gamestart("new game");
		
		
		game2.print();
		game2.gamestart("load game");
		
		
		
		
		
		
		

	}

}
