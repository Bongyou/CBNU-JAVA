
public class ExceptionProblem2 {
	public static void main(String[] args) {
		int[] array = {10,20,30};
		try {
			for(int i=0;i<=3;i++) {
				System.out.println("array["+i+"] : "+array[i]);
			}
		}catch(Exception e) {
			System.out.println("예외가 발생했습니다.");
		}
	}
}
