package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car[] cars = new Car[3];
		cars[0] = new Car();
		cars[1] = new Car();
		cars[2] = new Car();

		java.util.Scanner scanner = new java.util.Scanner(System.in);

		for (int i = 0; i < cars.length; i++) {

			String line = scanner.nextLine();

			String[] list = line.split(",", 0);

			cars[i].color = list[0];
			cars[i].gasoline = Integer.parseInt(list[1]);

			final int distance = 300;
			int sum = 0;

			for (int j = 1; distance > sum; j++) {

				int a = cars[i].run();

				if (a == -1) {
					System.out.println("目的地に到達できませんでした");
					break;
				}

				sum += a;

				if (sum >= distance) {
					System.out.println("目的地にまで" + j + "時間かかりました。残りのガソリンは、" + cars[i].gasoline + "です");
					break;
				}
			}
		}
	}
}
