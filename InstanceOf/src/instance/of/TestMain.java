package instance.of;

public class TestMain {

	public static void main(String[] args) {
		Dog dog = new Dog("martiz");
		Cat cat = new Cat("Navi");
		checkInstance(dog);
		checkInstance(cat);
		

	}
	
	public static void checkInstance(Behavior behavior) {
		if(behavior instanceof Cat) {
			behavior.bark();
		} else {
		 System.out.println("You're not a cat!");
		}
	}
}
