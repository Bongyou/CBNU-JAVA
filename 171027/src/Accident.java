
public class Accident {
	public static void main(String args[]) {
		try {
			int jumsu = Integer.parseInt(args[0]);
			if(jumsu>100) {
				throw new NumberFormatException("������ �ʹ� Ů�ϴ�.");
			}
		}catch(NumberFormatException e) {
			System.out.println("====================================");
			System.out.println(e.getMessage()+"���� �߻�");
		}
	}
}
