package day05.mypac;

public class Book {
	public String subject = "JAVA Prograning";
	public String writter = "김 완";
	
	public void read() {
		int page = 10;
		System.out.println(subject + " " + page + "페이지 읽어요!");
	}
	
	public void pillow() {
		System.out.println("베개로 사용해요!");
	}
	
}
