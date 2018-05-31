/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> list=new ArrayList<>();
		try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();

                // lineをsplitを使って文字列型配列にする
                String[] lists=line.split(",",0);

                // Player型のインスタンスを作る
                Player p=new Player();
                // Player型のインスタンスに、配列の中の要素を順番にセット
                p.setPosition(lists[0]);
                p.setName(lists[1]);
                p.setCountry(lists[2]);
                p.setTeam(lists[3]);

                // 情報がセットされた状態のインスタンスをlistにaddで追加
                list.add(p);

            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		Collections.shuffle(list);

		int countGK=0;
		int countDF=0;
		int countMF=0;
		int countFW=0;

		for(int i=list.size()-1;i>=0;i--) {

			if(list.get(i).getPosition().equals("GK")) {
				countGK++;
				if(countGK==1) {
					System.out.println(list.get(i).toString());
								}
			}if(list.get(i).getPosition().equals("DF")) {
				countDF++;
				if(countDF>=1&&countDF<=4) {
					System.out.println(list.get(i).toString());
				}
			}if(list.get(i).getPosition().equals("MF")){
				countMF++;
				if(countMF>=1&&countMF<=4) {
					System.out.println(list.get(i).toString());
				}
			}if(list.get(i).getPosition().equals("FW")){
				countFW++;
				if(countFW>=1&&countFW<=2) {
					System.out.println(list.get(i).toString());
				}
			}
		}
	}
}