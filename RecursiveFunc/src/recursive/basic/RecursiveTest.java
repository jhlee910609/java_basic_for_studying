package recursive.basic;

import java.util.List;

public class RecursiveTest {

	public static void main(String[] args) {
		System.out.println("recursive minus : " + recursiveMinus(10));
		printNumberReturn();
		printNumberBreak();
		
		

	}

	// 손으로 계산해보면 된다.
	// 로직이 어려운 것은 아니고, 원리를 아는 것이 더 좋다.
	// return 으로 자기 자신을 호출한다는 원리 말이다.
	static int recursiveMinus(int num) {
		if (num == 1)
			return 1;

		return num + recursiveMinus(num - 1);
	}
	
	static void printNumberBreak() {
		for(int i=0; i < 100; i++) {
			System.out.println(i + "");
			if(i == 55) {
				System.out.println("===== break 호출");
				break;
			}
		}
		
		System.out.println("break 완료 ");
	}
	
	static void printNumberReturn() {
		for(int i=0; i < 100; i++) {
			System.out.println(i + "");
			if(i == 55) {
				System.out.println("====== return 호출");
				return;
			}
		}
		
		System.out.println("return 완료");
	}
	
	
}
