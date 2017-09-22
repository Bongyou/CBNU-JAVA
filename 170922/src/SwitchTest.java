import java.util.*;

public class SwitchTest {
	public static void main(String args[]) {
		int score = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("임의의 숫자를 입력하세요 : "); //엔터를 누를 떄까지의 내용을 정수로 변환하여 n에 대입
		score = scanner.nextInt();
		System.out.println("점수 : "+score);
		scanner.close();
		
		char grade;
		switch(score/10) {
		case 10:
		case 9:
			grade='A';
			System.out.println("입력된 점수 "+score+"점은 "+grade+"학점 입니다.");
			break;
		case 8:
			grade='B';
			System.out.println("입력된 점수 "+score+"점은 "+grade+"학점 입니다.");
			break;
		case 7:
			grade='C';
			System.out.println("입력된 점수 "+score+"점은 "+grade+"학점 입니다.");
			break;
		case 6:
			grade='D';
			System.out.println("입력된 점수 "+score+"점은 "+grade+"학점 입니다.");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			grade='F';
			System.out.println("입력된 점수 "+score+"점은 "+grade+"학점 입니다.");
			break;
		default:
			System.out.println("잘못된 점수 입력입니다.");
		}
	}
}
