package learningJava;

import java.util.ArrayList;

public class Student {
		
	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();
	
	public Student(String name, int... marks) {  //Variable Arguments Java 5
		this.name=name;
		//this.marks=marks;
		for(int mark:marks) {
			this.marks.add(mark);
		}
	}
	
	
	public int getNumbersofMarks() {
		return marks.size();
	}
	
	public int getMinMark() {
		int min=Integer.MAX_VALUE;
		for(int Mark:marks) {
			if(Mark<min) {
				min=Mark;
			}
		}
		return min;
	}
	
	public int getMaxMark() {
		int max=Integer.MIN_VALUE;
		for(int Mark:marks) {
			if(Mark>max) {
				max=Mark;
			}
		}
		return max;
	}
	
	public int getSumofMarks() {
		int sum=0;
		for(int Mark:marks) {
			sum+=Mark;
		}
		return sum;	
	}
	
	public double getAvgofMarks() {
		int sum=getSumofMarks();
		int sizee=getNumbersofMarks();
		double avg =sum/sizee;
		return avg;
	}
	
	public String toString() {
		return name+ marks;
	}


	public void addNewMark(int mark) {
	marks.add(mark);
		
	}


	public void removeMarkAtIndex(int index) {
		marks.remove(index);
		
	}
}
