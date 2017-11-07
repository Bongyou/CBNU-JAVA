//7-5
/*
 Produce 클래스에 기본 생성자가 없기때문에 기본 생성자 Product(){}를 추가해준다.
 */
class Product{
	int price;
	int bonusPoint;
	
	Product(){}
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv(){}
	
	public String toString() {
		return "Tv";
	}
}

public class ex5 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}
