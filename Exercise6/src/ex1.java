//6-2
public class ex1 {
	public static void main(String args[]) {
		StudaCard card1 = new StudaCard(3,false);
		StudaCard card2 = new StudaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}

class StudaCard{
	int num; //6-1
	boolean iskwang;
	
	StudaCard(){
		this(1,true);
	}
	
	StudaCard(int num, boolean iskwang){
		this.num = num;
		this.iskwang = iskwang;
	}
	
	String info() {
		return num+(iskwang? "K":"");
	}
}

//6-3
class Student{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
}