public class MyArray{
	public static void main (String[] args){
		Human tom = new Human();
		tom.weight = 80;
		tom.printHight();
	}
}

class Human{
	int sex;
	int height = 180;
	private int weight = 75;
	
	
	public void printHight(){
		System.out.println(height);
	}
	public void printWeight(){
		System.out.println(weight);
	}
}