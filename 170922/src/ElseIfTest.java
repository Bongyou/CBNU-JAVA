
public class ElseIfTest {
	public static void main(String args[]) {
		int score = 52;
		if(score>=90&&score<=100)
			System.out.println("당신의 학점은 A입니다.");
		else if(score>=80&&score<90)
			System.out.println("당신의 학점은 B입니다.");
		else if(score>=70&&score<80)
			System.out.println("당신의 학점은 C입니다.");
		else if(score>=60&&score<70)
			System.out.println("당신의 학점은 D입니다.");
		else if(score>=0&&score<60)
			System.out.println("당신의 학점은 F입니다.");
		else
			System.out.println("잘못된 점수입니다.");
	}
}
