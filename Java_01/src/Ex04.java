import java.util.*;
public class Ex04 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int su1,su2;
		
		System.out.print("첫번째 정수 입력");
		su1 = in.nextInt();
		System.out.print("두번째 정수 입력");
		su2 = in.nextInt();
		
		System.out.println(su1+" + "+su2+" = "+(su1+su2));
		System.out.println(su1+" * "+su2+" = "+(su1*su2));
	
	}
}
