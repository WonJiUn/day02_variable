package day02_variable;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("����� �̸��� �����Դϱ�? ");
		String name = sc.nextLine();
		
		System.out.print(name + "���� ���� ���� : ");
		int kor = sc.nextInt();
		
		System.out.print(name + "���� ���� ���� : " );
		int eng = sc.nextInt();
		
		System.out.print(name + "���� ���� ���� : ");
		int mat = sc.nextInt();
		
		System.out.println();
		
		int total = kor + eng + mat;
		String line = "============";
		
		System.out.println(line);
		System.out.println("�̸� : " + name);
		System.out.println(line);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + mat);
		System.out.println(line);
		System.out.println("�հ� : " + total);
		System.out.println(line);
		
		
		
		
		
	}
}
