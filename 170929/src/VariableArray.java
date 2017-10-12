
public class VariableArray {
	public static void main(String[] args) {
		int[][] array= new int[3][];
		int i,j=0;
		array[0]=new int[1];
		array[1]=new int[2];
		array[2]=new int[1];
		array[0][0]=10;
		array[1][0]=20;
		array[1][1]=30;
		array[2][0]=40;
		for(i=0;i<array.length;i++) {
			for(j=0;j<array[i].length;j++)
				System.out.print("array["+i+"]["+j+"] = "+array[i][j]+" ");
			System.out.println();
		}
	}
}
