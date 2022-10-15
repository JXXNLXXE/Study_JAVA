import java.util.*;
public class Ex07 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("이름과 학과를 입력과 대학생 여부:");
		String name = input.next();
		String dept= input.next();
		boolean b = input.nextBoolean();
		System.out.println(name+" 은 "+dept+" 학과이고 대학생 여부 " +b);
	
	}
	
}
