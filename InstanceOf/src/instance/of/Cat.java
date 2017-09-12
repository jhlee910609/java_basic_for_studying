package instance.of;

public class Cat implements Behavior {

	public String name;

	public Cat(String n) {
		this.name = n;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub

	}

	@Override
	public void bark() {
		System.out.println(this.name + "이(가) 야옹!!!한다.");
	}

}
