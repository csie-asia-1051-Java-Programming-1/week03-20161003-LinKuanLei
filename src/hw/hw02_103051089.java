package hw;

import java.util.Scanner;

/*
 * Topic: 2. 讓使用者輸入多個數，統計正數、負數及零各有多少個。
 * Date: 2016/10/03
 * Author: 103051089 林冠磊
 */
public class hw02_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("需要輸入幾個值：");
		int count = scn.nextInt() , p = 0 , n =0 , z = 0;
		for(int i =0 ; i<count ; i++){
			System.out.print("輸入第"+(i+1)+"個值：");
			int check = scn.nextInt();
			if(check>0){
				p++;				
			}
			if(check<0){
				n++;
			}
			if(check==0){
				z++;
			}
		}
		System.out.println("正數："+p+"\t負數："+n+"\t零："+z);
	}

}
