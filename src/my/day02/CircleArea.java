package my.d	ay02;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ������ ����ϴ� ���α׷� �ۼ��ϱ�
		// ���� �������� ����ڷ� ���� �Է¹޾Ƽ� ����Ͻÿ�.
		// Scanner ��ü�� ����ϼ���..
        
		double num1;
		// ���� �������� �����ϴ� ���� ����
		double num2;
		// ���� ������ �����ϴ� ���� ����
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �������� �Է��ϼ���.");
		
	    num1 = scan.nextDouble();
		num2 = num1*num1*3.14;
		// ���� �������� �Է��ϼ���. ��� ���ڿ� ����ϱ�.
		
		System.out.println("���� ���� : " +num2);
		
		
		
	}

}
