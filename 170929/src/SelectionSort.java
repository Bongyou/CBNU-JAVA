
public class SelectionSort {
	public static void main(String[] args) {
		int array[]= {20,30,40,50,10};
		int i,j,temp;
		System.out.println("정렬 전");
		for(i=0;i<array.length;i++)
			System.out.println((i+1)+"번째 데이터 : "+array[i]);
		for(i=0;i<(array.length)-1;i++) {
			for(j=i+1;j<array.length;j++) {
				if(array[i]<array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("===============");
		System.out.println("===============");
		System.out.println("정렬 후");
		for(i=0;i<array.length;i++)
			System.out.println((i+1)+"번째 데이터 : "+array[i]);;
	}
}
