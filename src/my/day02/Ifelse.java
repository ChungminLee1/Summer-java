package my.day02;	

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� ������ �Է��ϼ���.");
		double a = scan.nextDouble();
		
		System.out.println("���� ������ �Է��ϼ���.");
		double b = scan.nextDouble();
		
		System.out.println("���� ������ �Է��ϼ���.");
		double c = scan.nextDouble();
		
		double Ave = ((a+b+c)/3);
		System.out.println("��� ������  : " +Ave);
		
		if(a>Ave) {
			System.out.println("���� ������ ��պ��� �����ϴ�.");
			
		} else if (a<Ave) {
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		} else {
			System.out.println("���� ������ ��� �Դϴ�.");
		}
			
		if(b>Ave) {
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		} else if (b<Ave) {
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		} else {
			System.out.println("���� ������ ����Դϴ�.");
		}
		
		if(c>Ave) {
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		} else if (c<Ave) {
			System.out.println("���� ������ ��պ��� �����ϴ�.");
		} else {
			System.out.println("���� ������ ����Դϴ�.");
		}
		
		
		
		
		
		

	}

}
