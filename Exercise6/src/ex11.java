//6-24
class ex11 {
	public static int abs(int value) {
		return value>=0? value : -value;
	}
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value+"ÀÇ Àý´ñ°ª : "+abs(value));
		value = -10;
		System.out.println(value+"ÀÇ Àý´ñ°ª : "+abs(value));
	}
}
