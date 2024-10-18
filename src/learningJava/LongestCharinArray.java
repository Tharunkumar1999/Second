package learningJava;

public class LongestCharinArray {

	public static void main(String[] args) {
			
		String[] names= {"Tharun","dhdcd","scsfvfv","dcsvvfssf","scsv"};
		
		String name="";
		
		for(String s1:names) {
			if(s1.length()>name.length()) {
				name=s1;
			}	
		}
		System.out.println(name);
		
	}
}
