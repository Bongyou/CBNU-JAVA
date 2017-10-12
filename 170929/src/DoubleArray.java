
public class DoubleArray {
	public static void main(String[] args) {
		int[][] array= {{10,20},{30,40}};
		int i,j;
		for(i=0;i<array.length;i++) {
			for(j=0;j<array[i].length;j++)
				System.out.print(" "+array[i][j]);
			System.out.println();
		}
	}
}
