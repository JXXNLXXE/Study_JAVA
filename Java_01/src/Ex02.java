
public class Ex02 {
	public static void main(String[] args) {
		
		int a= 10, b=10;
		/*
		String s = "검정"; // String s = new String("검정");//변수화
		String s1= "검정";
		*/
		String s = new String("검정");
		String s1 = new String("블랙");
		System.out.println(a==b);//true 
		System.out.println(s==s1);//변수 : true , 객체(객체화) : false
		System.out.println(s.equals(s1));//true(객체: s=블랙/s1=블랙)

	}
}
