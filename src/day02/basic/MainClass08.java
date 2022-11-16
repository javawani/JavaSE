package day02.basic;

/*
 * [[ 리터럴 ]]
 * 
 * 고정된 값을 리터럴이라고 한다
 * 
 * 숫자 예) 10, 10.1,
 * 문자 예) 'H', '글'
 * 
 * [[ 특수문자 리터럴 ]]
 * 
 * 1. \n : 줄바꿈(개행)
 * 2. \\t : 탭기능
 * 3. \\ : |문자화
 * 4. \' : '를 문자화
 * 4. \" : "를 문자화 
 *
 * 
 */

public class MainClass08 {
	public static void main(String[] args) {
		String str1 = "\"JavaStudy\"";
		System.out.println(str1);
		
		String str2 = "안녕하세요. \n \'김완\' 입니다. \n \t 반갑습니다/";
		System.out.println(str2);
	}

}
