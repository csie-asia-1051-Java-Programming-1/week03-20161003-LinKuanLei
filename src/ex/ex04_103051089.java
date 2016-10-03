package ex;

import java.util.Scanner;

/*
 * Topic: 將一連串數字(每個數字為 0~9)輸入，計算其和。例如：輸入 12345，輸出為15 (1+2+3+4+5=15)
 * Date: 2016/10/03
 * Author: 103051089 林冠磊
 */

public class ex04_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.print("輸入一串數字，將計算其和：");
		long v1 = scn.nextLong();
		int sum = 0 ;
		while(v1>0){
			sum = (int) (sum+v1%10);
			v1 = v1/10;
		}
		System.out.println("總和為"+sum);
	}

}
