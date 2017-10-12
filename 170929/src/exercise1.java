
public class exercise1 {
	public static void main(String[] args) {
		int[][] array= {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int total = 0;
		float average = 0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++)
				total += array[i][j];
		}
		average=(float)total/20;
		
		System.out.println("total = "+total);
		System.out.println("average = "+average);
	}
}
