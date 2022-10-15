import java.util.*;
public class Ex08 {
	public static void main(String args[]) { 
		
		Scanner in = new Scanner(System.in);
		System.out.println("이름, 도시, 나이, 체중, 독신 를 여부");
		String name = in.next();
		String city = in.next();
		
		int age = in.nextInt();
		double weight = in.nextDouble();
		boolean single = in.nextBoolean();
		
		System.out.println("이름은 " + name);
		System.out.println("도시는 " + city);
		System.out.println("나이는 " + age);
		System.out.println("체중은 " + weight);
		System.out.println("독신 여부는 " + single);
	}

}
