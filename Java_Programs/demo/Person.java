package demo;

public class Person {
    private String name;
    private int age;
    
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		
		Person p = new Person("Sadhu",44);
		System.out.println(p);
	}

}
