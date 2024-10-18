package learningJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListtt {
	
	private int id;
	public ArrayListtt(int id,String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ArrayListtt [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String name;
	private int age;

	public static void main(String[] args) {
		
		ArrayList<ArrayListtt> list =new ArrayList<ArrayListtt>
								(List.of(new ArrayListtt(1,"Tharun",25),
											new ArrayListtt(2,"Ayay",34),
											new ArrayListtt(2244,"Kumar",29),
											new ArrayListtt(242,"Danisj",21),
											new ArrayListtt(2525,"Bijoy",42)));
		list.stream().filter(a->a.getAge()>26).forEach(System.out::println);
		
		Map<String,Long> map= list.stream().filter(a->a.getAge()>22)
				.collect(Collectors.groupingBy(ArrayListtt::getName,Collectors.counting()));
		
		System.out.println(map);
		
		map.forEach((namee,countt)->{
		
		System.out.println("Name:"+namee +" Count:"+countt);});
		

	}

}
