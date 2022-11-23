package day03.loop;

/*
 * 다이아몬드 만들기 
 *
 */
public class MainClass05 {
	public static void main(String[] args) {
		int num = 0;

		for (int i = 0; i < 7; i++) {
			System.out.println(num + " : ");
			for (int j = 0; j < 7; j++) {
				if (i < 4) {

					if (j + i < 3) {
						System.out.println(" ");
					} else if (j - i > 3) {
						System.out.println(" ");
					} else {
						System.out.print("*");

					}
				} else {
					if (i - j > 3) {
						System.out.print(" ");
					} else {
						System.out.println("*");
					}

				}

			}
			System.out.println();
			num++;
		}

	}
}
