# Synchronized

- 온라인에 개인 블로거가 작성한 예제를 바탕으로 실습하였다.
- `synchronized` 가 적용된 메소드와 그렇지 않은 메소드의 처리 방식을 알 수 있다.





### 1. 전체 코드

> FamilyThread.java

```java
// Thread를 상속한 클래스를 작성한다. 
public class FamilyThread extends Thread {
	
	private BathRoom br;
	private String who;
	
	public FamilyThread(String name, BathRoom bathRoom) {
		who = name;
		br = bathRoom;
	}
		
	public void run() {
		br.openDoor(who);
	}
}
```



> SyncTest.java

```java
// 엔트리 포인트가 있는 SyncTest 클래스를 작성한다.
public class SyncTest {

	public static void main(String[] args) {
		
		BathRoom br = new BathRoom();
		
        // 1. 각각의 스레드를 new한다. (위의 클래스 코드를 통해 FamilyThread는 Thread를 상속함을 알 수 있다.)
		FamilyThread fahter = new FamilyThread("father", br);
		FamilyThread mother = new FamilyThread("Mother", br);
		FamilyThread me = new FamilyThread("Me", br);
		
      	// 2. 생성한 각각의 Thread를 .run(); 한다. 
		fahter.start();
		mother.start();
		me.start();
	}
}
```



### 2. Synchronized 미적용

##### 1.1. 부분 코드

> BathRoom.java의 적용 코드는 아래와 같다. 

```java
public class BathRoom {
  	// 일반 메소드를 작성한다.
	public void openDoor(String name) {
			System.out.println(name + " 님이 입장하셨습니다.");
			for(int i=0; i < 10000; i++) {
				if(i == 10000) {
					System.out.println("입장 : " + name);
				}
			}
			System.out.println(name + " 다 쌌다!!!!!");
		}
	}
}
		
```



##### 1.2. 실행결과

- 볼 일을 보는 중간에 다른 사람들 입장하는 불상사를 경험할 수 있다.
- 아래와 같은 상황을 별도로 처리해야한다. 

![](https://ws2.sinaimg.cn/large/006tNc79gy1fjbdkvie5cj30iw0aedhc.jpg)



### 2. Synchronized 적용

- 위와 같은 결과를 막기 위해 즉, 한 Thread의 task가 모두 완료될 때까지 다른 Thread의 간섭을 받지 않기 위해 `synchronized` 를 활용한다. (동기화하여 처리)

##### 2.1. 부분 코드

> 적용 코드는 아래와 같다.

```java
public class BathRoom {
	// synchronized 를 적용한 메소드를 작성한다. 
	public synchronized void openDoor(String name) {
		System.out.println(name + " 님이 입장하셨습니다.");
		for(int i=0; i < 10000; i++) {
			if(i == 10000) {
				System.out.println("입장 : " + name);
			}
		}
		System.out.println(name + " 다 쌌다!!!!!");
	}
}
```



##### 2.2. 실행결과

- 우리가 의도한대로 볼 일을 한 명씩 처리한다.
- `synchronized` 는 Thread의 모든 Task를 완료할 때까지 다른 Thread의 간섭을 받지 않는다.

![](https://ws3.sinaimg.cn/large/006tNc79gy1fjbdkuae3nj30im0ai75t.jpg)

