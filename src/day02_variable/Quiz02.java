package day02_variable;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("당신의 이름은 무엇입니까? ");
		String name = sc.nextLine();
		
		System.out.print(name + "님의 국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.print(name + "님의 영어 점수 : " );
		int eng = sc.nextInt();
		
		System.out.print(name + "님의 수학 점수 : ");
		int mat = sc.nextInt();
		
		System.out.println();
		
		int total = kor + eng + mat;
		String line = "============";
		
		System.out.println(line);
		System.out.println("이름 : " + name);
		System.out.println(line);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println(line);
		System.out.println("합계 : " + total);
		System.out.println(line);
		
		
		
		
		
	}
}
