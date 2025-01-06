package ch04_2;

import java.util.Scanner;

public class Test_0106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자1,연산자,숫자2를 입력하여 연산자에 따른 연산을 수행하세요");
		int a=sc.nextInt();
		String b=sc.next();
		int c=sc.nextInt();
		int d=0;
		//== :변수 메모리에 지정된 값이 같은지 비교
		
		if(b.equals("+")) {
			d=a+c;
			
		}else if(b.equals("-")) {
			d=a-c;
		}else if(b.equals("*")) {
			d=a*c;
		}else if(b.equals("/")) {
			d=a/c;
		}else {
			System.out.println("입력오류");
		}
		System.out.println(d);
		
		switch (b) {
		case "+": d=a+c; break;
		case "-": d=a-c; break;
		case "*": d=a*c; break;
		case "/": d=a/c; break;
		case "%": d=a%c; break;
				
		default:
			System.out.println("입력 오류");
		}
		System.out.println(d);

	}

}
