import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BinarySearch {
	public static void main(String[] args) {
		int data[]= {11,16,21,26,35,39,47};
		int k=0,counter=0;
		int low=0;
		int high=data.length-1;
		int middle;
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ã�� ���ڸ� 2�ڸ��� �Է��Ͻÿ� : ");
		try {
			k=Integer.parseInt(in.readLine());
		}catch(Exception e) {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		while(true) {
			if(low>high) {
				System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
				break;
			}
			middle=(low+high)/2;
			counter++;
			System.out.println("�񱳰� : "+data[middle]);
			if(data[middle]==k) {
				System.out.println(middle+1+"��° ��ġ �˻�Ƚ�� = "+counter+"��");
				break;
			}
			if(k>data[middle])
				low=middle+1;
			else
				high=middle-1;
		}
	}
}