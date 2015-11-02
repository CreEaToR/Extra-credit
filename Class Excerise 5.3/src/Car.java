
public class Car {

	private String color;
	private int HorsePower;
	private int EngineSize;
	


public Car(){
	
	
	
	
}

public Car(String color, int HorsePower, int EngineSize){
	
	this.color = color;
	this.HorsePower = HorsePower;
	this.EngineSize = EngineSize;
	
	
	
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getHorsePower() {
	return HorsePower;
}

public void setHorsePower(int horsePower) {
	HorsePower = horsePower;
}

public int getEngineSize() {
	return EngineSize;
}

public void setEngineSize(int engineSize) {
	EngineSize = engineSize;
}

public String toString(){
	
	return "Color: " + this.color + " HorsePower: " + this.HorsePower + " EngineSize " + this.EngineSize;
	
	
	
}


}
