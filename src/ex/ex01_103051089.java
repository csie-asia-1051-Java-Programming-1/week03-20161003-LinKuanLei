package ex;
/*
 * Topic: 輸入一個字串，並把它反向輸出。
 * Date: 2016/10/03
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class ex01_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//方法1
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入文字：");
		String str=scn.nextLine();
		String strR = new StringBuilder(str).reverse().toString();
		System.out.println(strR);
		//方法2
		System.out.println("請輸入文字：");
		String str2 =scn.nextLine();
		char[] data =str2.toCharArray();
		for(int i=data.length-1;i>=0;i--){
			System.out.print(data[i]);
		}
	}

}
