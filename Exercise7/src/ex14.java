//7-14
class SutdaCard2{
	final int Num;
	final boolean Is_Kwang;
	
	SutdaCard2(){
		this(1,true);
	}
	
	SutdaCard2(int num, boolean isKwang){
		this.Num = num;
		this.Is_Kwang = iskwang;
	}
	
	public String toString() {
		return Num+(Is_Kwang?"K":"");
	}
}

public class ex14 {
	public static void main(String args[]) {
		SutdaCard2 card2 = new SutdaCard2(1,true);
	}
}
