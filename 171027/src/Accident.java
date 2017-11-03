
public class Accident {
	public static void main(String args[]) {
		try {
			int jumsu = Integer.parseInt(args[0]);
			if(jumsu>100) {
				throw new NumberFormatException("점수가 너무 큽니다.");
			}
		}catch(NumberFormatException e) {
			System.out.println("====================================");
			System.out.println(e.getMessage()+"예외 발생");
		}
	}
}
