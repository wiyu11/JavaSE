package section07;
/*
 * JVM(Java Virtual Machine)
 *   자바 애플리케이션을 실행하기 위한 가상머신.
 *   JVM은 운영체제와 자바 애플리케이션 사이 중계자 역할을 한다.
 * 
 * JVM 메모리 구조
 * 	1. 메서드 영역(Method Area) or 클래스 영역(Class Area)
 * 		JVM이 실행하는 애플리케이션 사용되는 클래스 정보 저장
 * 		JVM 시작될 때 클래스 로더에 의해 로드되며, 모든 스레드가 공유.
 * 
 *  2. 힙 영역(Heap Area)
 *  	객체 인스턴스가 저장되는 영역, 동적으로 생성된 객체들이 할당된다.
 *  
 *  3. 스택 영역(Stack Area)
 *  	메서드 호출과 관련된정보(로컬변수, 매개변수, 메서드 호출 등) 저장.
 *  	각 스레드마다 별도의 스택이 생성된다.
 *  
 *  4. PC 레지스터 (Program Counter Register)
 *  	현재 실행 중인 명령어의 주소를 가리키는 포인터
 *  
 *  5. 네이티브 메서드 스택(Native Method Stack)
 *  	자바 코드 외부의 네이티브 코드(C, C++ 등)를 실행할 때 사용.
 * 
 */

public class JVM {
	public static void main(String[] args) {
		// 객체 주소값 출력하기
		Car car1 = new Car();
		Car car2 = new Car();
		
		System.out.println(System.identityHashCode(car1));
		System.out.println(System.identityHashCode(car2));
		
	}
}



