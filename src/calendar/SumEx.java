package calendar;

import java.util.Scanner;

public class SumEx {
	public static void main(String[] args) {
		//enter keyboard;
		//출력 화면 
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해요");
		String a1 = "";
		String a2 = "";
		a1 = sc.next();
		a2 = sc.next();
		
		a = Integer.parseInt(a1);
		b = Integer.parseInt(a2);
		System.out.println(a1+","+a2);
		
		System.out.printf("%d 와 %d 의 합은 %d입니다.",a,b,a+b);
		sc.close();
	}
}
