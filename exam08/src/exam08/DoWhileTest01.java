package exam08;

public class DoWhileTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 1;
		int sum = 0;
		
		do {
			
			sum += count++;
			
		} while(count <= 10);
		
		System.out.println(sum);

	}

}
