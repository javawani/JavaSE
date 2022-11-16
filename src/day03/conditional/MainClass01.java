package day03.conditional;

/*
 * [[ 조건문 ]]
 * 
 *  주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 제어하는 명령문
 *  
 *  if 문 사용법
 *  
 *  if(조건식) {
 *  	조건식 true 일 떄 실행명령문
 *  }else if(조건식) {
 *  	조건식 true 일 떄 실행명령문
 *  } else {
 *  	모든 조건식이 false 일 때 실행명령문
 *  }
 *  
 * 
 */



public class MainClass01 {
	public static void main(String[] args) {
		int num = 11;
		if(num%2 == 0) {
			System.out.println("1. num은 짝수 입니다.");
		}
		
		if(num%2 != 0) {
			System.out.println("1. num은 홀수 입니다.");
		}
		
		if(num%2 == 0) {
			System.out.println("2. num은 짝수 입니다.");
		}else if(num%2 != 0) {
			System.out.println("2. num은 홀수 입니다.");
		}
		
		if(num%2 == 0) 
			System.out.println("3. num은 짝수 입니다.");
		else if(num%2 != 0)
			System.out.println("3. num은 홀수 입니다.");
		
		
		
	}
}
