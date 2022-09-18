package round2_assisted_pro;

class MenuExtension extends HotelMenu{

	@Override
	public void veg() {
		System.out.println("it contains gobi fried rice,veg noodles...");
			}

	@Override
	public void nonVeg() {
		System.out.println("it contains chicken,mutton,fish,prawn....");
	}

	@Override
	public void breakFastMenu() {
		System.out.println("it contains Idly,Dose, puri....");
	}
	
}

public class Abstraction {
	public static void main(String[] args) {
		MenuExtension obj=new MenuExtension();
		obj.nonVeg();
		obj.breakFastMenu();
	}
}
