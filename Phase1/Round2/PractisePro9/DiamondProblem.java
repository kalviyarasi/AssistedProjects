package round2_assisted_pro;

interface First{
	default void show() {
		System.out.println("First interface");
	}
}
interface Second{
	default void show() {
		System.out.println("Second Interface");
	}
}

public class DiamondProblem implements First,Second{
	public void show() {
		First.super.show();
		Second.super.show();
	}
	public static void main(String[] args) {
		DiamondProblem obj=new DiamondProblem();
		obj.show();
	}
}
