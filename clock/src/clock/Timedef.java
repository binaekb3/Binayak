package clock;

public class Timedef {

	public static void main(String[] args) {
			Elements elements=new Elements();
			elements.toMilitary();
			System.out.println(elements.toMilitary());
			//elements.setTime(13, 25, 56);
			System.out.println(elements.toMilitary());
			System.out.println(elements.toString());
			elements.setTime(20, 35, 12);
			System.out.println(elements.toString());
	
	}

}
