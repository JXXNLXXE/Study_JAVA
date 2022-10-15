import java.util.*;
public class Ex01 {
	public static void main(String[] args) {
		
		final double PI=3.14;
		Scanner s = new Scanner(System.in);
		System.out.print("반지름 입력");
		
		double r = s.nextDouble();
		double area = r*r*PI;
		
		System.out.println("원의 면적은 :"+area);
	}

	
}
