package ex;

import java.util.Scanner;

/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 103051089 林冠磊
 */

public class ex05_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入一個數字：");
		long num = scn.nextLong();
		if(num%2==0){
			System.out.print("偶數！！");
		}else{
			System.out.print("奇數！！");
		}		
	}

}
