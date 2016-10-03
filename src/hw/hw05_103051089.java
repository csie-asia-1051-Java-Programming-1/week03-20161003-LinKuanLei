package hw;

import java.util.Scanner;

/*
 * Topic: 5. 讓使用者輸入一正整數n，計算1*(1+1) + 2*(2+1) + 3*(3+1) + … + n*(n+1)並輸出結果。
 * Date: 2016/10/03
 * Author: 103051089 林冠磊
 */
public class hw05_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入一正整數：");
		int inNum = scn.nextInt() , outNum = 0;
		for(int i =1 ; i <= inNum ; i++){
			outNum += i*(i+1);
		}
		System.out.println("輸出值為"+outNum);
	}

}
