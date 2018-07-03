package my.day02;	

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요.");
		double a = scan.nextDouble();
		
		System.out.println("영어 점수를 입력하세요.");
		double b = scan.nextDouble();
		
		System.out.println("수학 점수를 입력하세요.");
		double c = scan.nextDouble();
		
		double Ave = ((a+b+c)/3);
		System.out.println("평균 점수는  : " +Ave);
		
		if(a>Ave) {
			System.out.println("국어 점수는 평균보다 높습니다.");
			
		} else if (a<Ave) {
			System.out.println("국어 점수는 평균보다 낮습니다.");
		} else {
			System.out.println("국어 점수는 평균 입니다.");
		}
			
		if(b>Ave) {
			System.out.println("영어 점수는 평균보다 높습니다.");
		} else if (b<Ave) {
			System.out.println("영어 점수는 평균보다 낮습니다.");
		} else {
			System.out.println("영어 점수는 평균입니다.");
		}
		
		if(c>Ave) {
			System.out.println("수학 점수는 평균보다 높습니다.");
		} else if (c<Ave) {
			System.out.println("수학 점수는 평균보다 낮습니다.");
		} else {
			System.out.println("수학 점수는 평균입니다.");
		}
		
		
		
		
		
		

	}

}
