package ch04_2;

import java.util.Scanner;

public class While03_0106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("영문 소문자를 대문자로 변환하는 프로그램");
		
		do {
			System.out.println("대문자로 변경할 소문자를 입력하세요, 종료하기 quit를 입력하세요");
			s=sc.next();
			char ch=s.charAt(0);
			System.out.println((char)(ch-32));
		}while(!s.equals("quit"));
		System.out.println("end");

			
		
		

	}

}