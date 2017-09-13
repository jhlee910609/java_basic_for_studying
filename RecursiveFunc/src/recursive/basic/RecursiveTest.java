package recursive.basic;

public class RecursiveTest {

	public static void main(String[] args) {
		System.out.println("recursive minus : " + recursiveMinus(10));

	}

	// 손으로 계산해보면 된다.
	// 로직이 어려운 것은 아니고, 원리를 아는 것이 더 좋다.
	// return 으로 자기 자신을 호출한다는 원리 말이다.
	static int recursiveMinus(int num) {
		if (num == 1)
			return 1;

		return num + recursiveMinus(num - 1);
	}
}
