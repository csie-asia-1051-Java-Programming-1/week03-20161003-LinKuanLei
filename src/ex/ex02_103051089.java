package ex;
/*
 * Topic: 輸入一個字元，判斷是大寫或小寫或是其他字元。
 * Date: 2016/10/03
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class ex02_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個字元：");
		char data = scn.next().charAt(0);
		if (data>='A'&&data<='Z'){
			System.out.println("大寫");				
		}else{
			if(data>='a'&&data<='z'){
			System.out.println("小寫");
			}else
			{
				System.out.println("其他");
			}			
		}		
	}

}
