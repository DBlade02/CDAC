class Brain{
    private int age;
    private String name; 
    
    public void setAge(int a){
        this.age = a;
    }
    public int getAge(){
        return this.age;
    }
    
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }
}
public class Main11
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Brain br = new Brain();
		br.setAge(30);
        br.setName("Aditya Vijay Mogre");
        System.out.println("Name: " + br.getName());
        System.out.println("Age: " + br.getAge());
	}
}