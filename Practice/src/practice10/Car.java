package practice10;

public class Car {

	int serialNo;
	String color;
	int gasoline;

	int run() {
		gasoline--;

		if(gasoline>-1) {
		int random = new java.util.Random().nextInt(15);
		random++;
		return random;
		}else {
		return -1;
		}
	}
}