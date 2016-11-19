package ex;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入x，並計算y值輸出，其公式如下：
 * y = 3*x2				若 x < -1
 * y = x3+3*x-3			若 -1 <= x <= 1
 * y = 2*x+3			若 x > 1
 * Date: 2016/10/03
 * Author: 103051089 林冠磊
 */

public class ex06_103051089 {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入X：");
		float x = scn.nextFloat() , y = 0;
		if(x < -1){
			y = (float)(3*Math.pow(x,2)); 
		}
		if(x<=1 && x >= -1){
			y = (float)Math.pow(x, 3)+3*x-3; 
		}
		if(x > 1 ){
			y = 2*x+3; 
		}
		System.out.println(y);
	}

}
