//8-8
import java.util.*;

public class ex3 {
	public static void main(String[] args) {
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		
		do {
			count++;
			System.out.println("1�� 100������ ���� �Է��Ͻÿ� : ");
			//input = new Scanner(System.in).nextInt();
			try {
				input = new Scanner(System.in).nextInt();
			}catch(Exception e) {
				System.out.println("��ȿ�� ���� �ƴմϴ�.");
				continue;
			}
			
			if(answer>input) {
				System.out.println("�� ū ���� �Է��Ͻÿ�.");
			}
			else if(answer<input) {
				System.out.println("�� ���� ���� �Է��Ͻÿ�.");
			}
			else {
				System.out.println("���߾����ϴ�.");
				System.out.println("�õ�Ƚ���� "+count+"�� �Դϴ�.");
				break;
			}
		}while(true);
	}
}
