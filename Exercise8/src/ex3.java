//8-8
import java.util.*;

public class ex3 {
	public static void main(String[] args) {
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하시오 : ");
			//input = new Scanner(System.in).nextInt();
			try {
				input = new Scanner(System.in).nextInt();
			}catch(Exception e) {
				System.out.println("유효한 값이 아닙니다.");
				continue;
			}
			
			if(answer>input) {
				System.out.println("더 큰 수를 입력하시오.");
			}
			else if(answer<input) {
				System.out.println("더 작은 수를 입력하시오.");
			}
			else {
				System.out.println("맞추었습니다.");
				System.out.println("시도횟수는 "+count+"번 입니다.");
				break;
			}
		}while(true);
	}
}
