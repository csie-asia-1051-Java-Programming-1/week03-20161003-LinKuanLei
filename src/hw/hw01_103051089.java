package hw;

import java.util.Scanner;

/*
 * Topic: 1. 輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
 * Date: 2016/10/03
 * Author: 103051089 林冠磊
 */
public class hw01_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入一個正整數值(不含 0)：");
		long num = scn.nextLong() , count=0;		
		while(num>0){
		num =  num/10;
		count++;
		}
		System.out.println("輸入值為"+count+"位數");
	}

}
