
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		int b=1;
		double c = 1;
		double c2 = (double) 1;
		System.out.println(c);
		
		int d = (int) 1.1; // 강제로 double형을 정수로 바꿈
		System.out.println(d);
		
		String strI = Integer.toString(1);
		System.out.println(strI.getClass()); 
	}

}

// 프로그램이란 무엇인가