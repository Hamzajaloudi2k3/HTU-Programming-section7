package inheritance;

public class MyDerived extends MyBase{
	
	private int y;
	
	public void SetY(int x) {
		y=x;
	}
	public int getY() {
		
		return y;
		
	}
	public void show () {
		System.out.println("z= " + getZ());
		System.out.println("y= " +getY());
	}
}
