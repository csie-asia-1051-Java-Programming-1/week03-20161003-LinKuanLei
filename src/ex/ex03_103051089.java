package ex;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 103051089 林冠磊
 */
import java.util.Scanner;
public class ex03_103051089 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入一個字元：");
		char data = scn.next().charAt(0);
		if(data>='a'&&data<='z'){
			int v1 = data -'a';
			System.out.print((char)(v1+'A'));
		}else{
			if(data>='A'&&data<='Z'){
				int v1 = data -'A';
				System.out.print((char)(v1+'a'));
			}else{
			System.out.println("輸入的不是英文字母！");		
			}
		}
	}

}
