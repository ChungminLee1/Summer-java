package my.d	ay02;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 원의 면적을 계산하는 프로그램 작성하기
		// 원의 반지름을 사용자로 부터 입력받아서 계산하시오.
		// Scanner 객체를 사용하세요..
        
		double num1;
		// 원의 반지름을 저장하는 변수 선언
		double num2;
		// 원의 면적을 저장하는 변수 선언
		
		Scanner scan = new Scanner(System.in);
		System.out.println("원의 반지름을 입력하세요.");
		
	    num1 = scan.nextDouble();
		num2 = num1*num1*3.14;
		// 원의 반지름을 입력하세요. 라는 문자열 출력하기.
		
		System.out.println("원의 면적 : " +num2);
		
		
		
	}

}
