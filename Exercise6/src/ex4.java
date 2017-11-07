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
-클래스변수(static변수) : width, height
-인스턴스변수 : kind, num
-지역변수 : k, n, card, args
*/