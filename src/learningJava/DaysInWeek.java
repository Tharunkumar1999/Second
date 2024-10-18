package learningJava;

public class DaysInWeek {

	public static void main(String[] args) {
		
		String[] Day={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		Days day1=new Days(Day);
		
		String longest=day1.longestString();
		
		System.out.println("Days with more character is "+longest);
		
		for(String i:Day) {
			System.out.println(i);
		}
		
	}

}
