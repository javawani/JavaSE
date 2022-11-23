package day04.method;
/*
 * [[ 메소드(method) ]]
 *  어떤 특정 작업을 수행하기 위한 명령문의 집합.
 *  
 * 접근제어자 선언 (정적) 반환타입 메소드이름(매개변수타입 매개변수명) { // 선언부
 * 
 * public    static void   hello()
 *  중괄호 사이에 명령문을 쓰면된다 (구현부)
 *  
 *  return 반환값;
 * }
 * 
 * 오버로딩
 * 		메소드 명이 같아도 매개변수 갯수 또는 타입이 다르면 사용가능
 * 
 */

public class MainClass01 {
	public static String name; // 전역변수 name 선언
	
	
	public static void main(String[] args) {
		System.out.println("main method 시작");
		
		//hello 메소드 호출하기
		hello();	
		
		// printName 메소드 호출하기
	    printName("김완");
	    
	    setName("피카츄");
	    
	    String strName = getName();
	    
	    System.out.println("전역변수 name : " + strName);
	    
	    String eMon = getEvolution("꼬부기");
	    
	    System.out.println(eMon);
	}
	
	// 인자 없음, 리턴 없음 - 실행하고 끝나는 메소드
	public static void hello() {
		System.out.println("Hello, World");
		
		
	}
	// 인자(매개변수 존재) 리턴 없음
	public static void printName(String name) {
		System.out.println("이름 : " + name);
	}
		
	
	//  오버로딩메소드라고 부른다
	public static void printName(String name, int age) {
	System.out.println("이름 : " + name);
	System.out.println("나이 : " + age);
	}
	
	// 인자 O 리턴 X 매개변수를 전역변수 name에 대입
	public static void setName(String name) {
		MainClass01.name = name;
	}
	// 인자 X 리턴 O 전역변수 name을 리턴한다
	public static String getName() {
		return name; // MainClass01.name
	}
	
	public static String getEvolution(String mon) {
		String eMon = "";
		if(mon.equals("꼬부기")) {
			eMon = "어니부기";
		}else if(mon.equals("어니부기")) {
			eMon = "거북왕";
		}
		return eMon;
	}
}
