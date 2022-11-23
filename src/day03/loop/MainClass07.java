package day03.loop;

/*
 *  continue 문
 *  반복문 스킵 (한번 건너뛰기)
 *  만나는 순간 아래코드가 실행되지 않는 것이다.
 *  
 */

public class MainClass07 {
	public static void main(String[] args) {
		for(int i=0; i < 5; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println("i : " + i);
		}
	}
}
