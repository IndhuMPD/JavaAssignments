package day1;

public class Animal {
	
	String animal_name = "Dog";
	int height = 120;
	
	public void run() {
		System.out.println("Run faster");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
		a.run();
		System.out.println(a.animal_name);
	}

}
