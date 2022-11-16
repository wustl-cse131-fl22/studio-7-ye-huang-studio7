package studio7;

public class Die {
	
	private int sides;
	
	public Die(int x) {
	      sides = x;
	}
	
	public int getnum() {
		return (int)(Math.random() * sides + 1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die d1 = new Die(7);
		System.out.println(d1.getnum());
	}

}
