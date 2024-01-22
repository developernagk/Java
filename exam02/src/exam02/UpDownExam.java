package exam02;

public class UpDownExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10;
		int sum = 0;
		
		// 연산 후 증가
		sum = num++;
		
		String str = "";
		
		str = "sum = " + sum + ", num : " + num;
		
		
		System.out.println(str);
		
		// 연산 전 증가
		sum = ++num;
		
		System.out.println("sum = " + sum + ", num : " + num);

	}

}
