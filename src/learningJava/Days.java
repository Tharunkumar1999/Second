package learningJava;

public class Days {
	
	private String[] day;
	
	public Days(String[] day) {
		this.day=day;
	}

	public String longestString() {
		String DayswithmoreChar ="";
		
		for(String Day:day) {
			if(Day.length()>DayswithmoreChar.length()){
				DayswithmoreChar=Day;
			}
		}
		return DayswithmoreChar;
	}

}
