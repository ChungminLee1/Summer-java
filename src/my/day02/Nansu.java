package my.day02;

import java.util.*;

public class Nansu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int num = rand.nextInt(100);
		// 랜덤 <= 난수 < 랜덤    (시작값은 이상 마지막 값은 미만)
		// 시작수를 0이 아닌 수로 시작하려면 0 + 값  int()안 마지막 수는 int(x) + 값 
		 
		System.out.println("컴퓨터가 생성한 난수 : " +num);
		
		
	}

}
