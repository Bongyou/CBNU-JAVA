import java.util.*;

public class SwitchTest {
	public static void main(String args[]) {
		int score = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ ���ڸ� �Է��ϼ��� : "); //���͸� ���� �������� ������ ������ ��ȯ�Ͽ� n�� ����
		score = scanner.nextInt();
		System.out.println("���� : "+score);
		scanner.close();
		
		char grade;
		switch(score/10) {
		case 10:
		case 9:
			grade='A';
			System.out.println("�Էµ� ���� "+score+"���� "+grade+"���� �Դϴ�.");
			break;
		case 8:
			grade='B';
			System.out.println("�Էµ� ���� "+score+"���� "+grade+"���� �Դϴ�.");
			break;
		case 7:
			grade='C';
			System.out.println("�Էµ� ���� "+score+"���� "+grade+"���� �Դϴ�.");
			break;
		case 6:
			grade='D';
			System.out.println("�Էµ� ���� "+score+"���� "+grade+"���� �Դϴ�.");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			grade='F';
			System.out.println("�Էµ� ���� "+score+"���� "+grade+"���� �Դϴ�.");
			break;
		default:
			System.out.println("�߸��� ���� �Է��Դϴ�.");
		}
	}
}
