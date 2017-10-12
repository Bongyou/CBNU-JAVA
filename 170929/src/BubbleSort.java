
public class BubbleSort {
	public static void main(String[] args) {
		int array[]= {20,30,40,50,10};
		int i,j,temp,flag;
		System.out.println("정렬 전");
		for(i=0;i<array.length;i++)
			System.out.println((i+1)+"번쨰 데이터 : "+array[i]);
		for(i=0;i<(array.length)-1;i++) {
			flag=0;
			for(j=0;j<(array.length)-1-i;j++) {
				if(array[j]<array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
				break;
		}
		System.out.println("===============");
		System.out.println("===============");
		System.out.println("정렬 후");
		for(i=0;i<array.length;i++)
			System.out.println((i+1)+"번째 데이터 : "+array[i]);
	}
}
