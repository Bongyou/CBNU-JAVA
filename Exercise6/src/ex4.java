//6-7
class Mypoint{
	int x;
	int y;
	
	Mypoint(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	double getDistance(int x1,int y1) {
		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	}
}

class ex4 {
	public static void main(String args[]) {
		Mypoint p = new Mypoint(1,1);
		
		System.out.println(p.getDistance(2, 2));
	}
}

//6-8
/*
-Ŭ��������(static����) : width, height
-�ν��Ͻ����� : kind, num
-�������� : k, n, card, args
*/