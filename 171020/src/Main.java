
public class Main {
	public static void main(String[] args) {
		Terran marine = new Terran();
		marine.attack();
		Protoss dragon =  new Protoss();
		dragon.attack();
		Zerg hydralisk = new Zerg();
		hydralisk.attack();
		
		System.out.println("====객체 변형과 오버라이딩을 이용====");
		Starcraft obj = new Terran();
		obj.attack();
		obj = new Protoss();
		obj.attack();
		obj = new Zerg();
		obj.attack();
		
	}
}
