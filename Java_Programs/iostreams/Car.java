package iostreams;

import java.io.Serializable;

public class Car implements Serializable{
   private int regNo;
   private String make;
   private String fuelType;
   private transient int chassisNo;
   
public Car(int regNo, String make, String fuelType, int chassisNo) {
	super();
	this.regNo = regNo;
	this.make = make;
	this.fuelType = fuelType;
	this.chassisNo = chassisNo;
}

@Override
public String toString() {
	return "Car [regNo=" + regNo + ", make=" + make + ", fuelType=" + fuelType + ", chassisNo=" + chassisNo + "]";
}


   
   

}
