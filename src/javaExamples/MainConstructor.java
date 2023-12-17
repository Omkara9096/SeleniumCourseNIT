package javaExamples;


class Human {
	
	private int age;
	private String name;
	
	public Human() {
		
		age = 12;
		name = "omkar";
		System.out.println("Its a Constructor called once object is created");
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name ;
	}
}
public class MainConstructor {
	
	public static void main(String[] args) {
		
		Human obj = new Human();
		
		obj.setName("Soumesh");
		obj.setAge(23);
		
		System.out.println(obj.getName() + " : " + obj.getAge());
		
		obj.setName("Rutvik");
		obj.setAge(35);
		
		System.out.println(obj.getName() + " : " + obj.getAge());
		
		
	}

}
