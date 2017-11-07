//6-5
/*class ex3 {
	public static void main(String args[]) {
		Student s = new Student("°í±æµ¿",1,1,100,60,76);
		
		System.out.println(s.info());
	}
}

class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name,int ban,int no,int kor,int eng,int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return (int)(getTotal()/3f*10+0.5f)/10f;
	}
	
	public String info() {
		return name+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}
}*/

//6-6
class ex3{
	static double getDistance(int x,int y,int x1,int y1) {
		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	}
	
	public static void main(String args[]) {
		System.out.println(getDistance(1,1,2,2));
	}
}

