package exam03;

public class ChangeCharExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'E';
		int num = 97;
		
		int chToNum = 0;
		char intToCh = ' ';
		
		// int 와 char 는 자동 형변환
		// char --> int 로 변결할 때는 자동 형변환 가능
		chToNum = ch;
		// int --> char 변경할 때는 강제 형변환
		intToCh = (char)num;
		
		System.out.println(chToNum);
		System.out.println(intToCh);

	}

}
