package iostreams;
import java.io.*;
public class SerializeDemo {

	public static void main(String[] args) throws Exception {
		
		Car car1 = new Car(1234,"Tata", "Petrol", 4321);
		System.out.println(car1);
		
		// serialization
		 FileOutputStream fos = new FileOutputStream("C:/Users/hp/Desktop/File/car.data");
		 ObjectOutputStream oos = new ObjectOutputStream(fos);
		 oos.writeObject(car1);
		
		System.out.println("Object Serialized");
		
		// De-serialization
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:/Users/hp/Desktop/File/car.data"));
		ObjectInputStream ois = new ObjectInputStream(bis);
		System.out.println("Object de-serialized");
		Car car2 = (Car) ois.readObject();
		System.out.println(car2);
	}

}
