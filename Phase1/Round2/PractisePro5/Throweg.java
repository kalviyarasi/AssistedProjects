package round2_assisted_pro;

class Heightvalidation{
	void validateHeight(int height) throws Invalidheight {
		if(height>=156) {
			System.out.println("your elgible to ride in rollarcoaster , Enjoy your ride");
		}
		else
			throw new Invalidheight("your are too short to get into the ride");
	}
}
public class Throweg {
	public static void main(String[] args) throws Invalidheight {
		Heightvalidation obj = new Heightvalidation();
		obj.validateHeight(157);
	}

}

class Invalidheight extends Exception {
	Invalidheight(String str){
		super(str);
	}

}