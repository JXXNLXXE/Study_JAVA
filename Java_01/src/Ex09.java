import java.util.*;
public class Ex09 {	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		System.out.println("국어 점수입력");
		int kor = in.nextInt();
		
		System.out.println("영어 점수입력");
		int eng = in.nextInt();
		
		System.out.println("수학 점수입력");
		int math = in.nextInt();
		
		int sum = kor + eng + math;
		double avg= (double)sum/3;
		
		System.out.println("3과목의 총점은 :"+sum);
		System.out.println("3과목의 평균은 :"+avg);

	}

}
