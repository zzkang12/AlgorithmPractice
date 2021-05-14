package study.com;

import java.util.Scanner;
// 입력 받는 값을 Scanner로 활용합니다.

public class AlgorithmEx01 {

	public static void main(String[] args) {

		int a, b, c, max;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3개의 정수를 입력하시오: (띄어쓰기 구분)");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		// 3개의 정숫값을 받았습니다.
		max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("최댓값은 "+max+"입니다.");

	}

}
