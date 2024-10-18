package learningJava;

public class StudentRunner {

	public static void main(String[] args) {
		
		Student student =new Student("Tharun", new int[] {99,98,100});
		Student student1 =new Student("Tharunkumar",999,98,100,590);
		
		int number=student.getNumbersofMarks();
		int sum=student1.getSumofMarks();
		int max=student1.getMaxMark();
		int min=student.getMinMark();
		double avg=student.getAvgofMarks();
		
		System.out.println("Number of Marks = "+number);
		System.out.println("Sum of Marks = "+sum);
		System.out.println("Max Mark = "+max);
		System.out.println("Min Mark = "+min);
		System.out.println("Avg Mark = "+avg);
		
		System.out.println(student);
		System.out.println(student1);
		
		student1.addNewMark(78);
		
		System.out.println(student1);
		
		student1.removeMarkAtIndex(2);
		
		System.out.println(student1);

	}

}
