package study.com;

public class Test {

	public static int sum(int n, int m) {    //
		return n+m;								//  메소드 정의 구간
	}													//
	
	public static void main(String[] args) {

		int i = 20;	//
		int s;			//  변수 선언
		char a;		//
		
		s = sum(i, 10);	// s에 메소드 활용
		a = '?';
		
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);
	}

}
