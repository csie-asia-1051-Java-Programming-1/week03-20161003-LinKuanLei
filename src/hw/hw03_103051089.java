package hw;

import java.util.Scanner;

/*
 * Topic: 3. 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 * Date: 2016/10/03
 * Author: 103051089 林冠磊
 */
public class hw03_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入一正整數：");
		int n = scn.nextInt() , outNum = 1;
		for(int i =1;i<=n;i++){
			outNum *= i;
		}
		System.out.println(n+"!為"+outNum);

	}

}
