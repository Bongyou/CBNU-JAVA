//6-22
/*class ex10 {
	public static boolean isNumber(String str) {
		if(str==null||str.equals(""))
			return false;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch<'0'||ch>'9') {
				return false;
			}
		}
		return true;
	}
	
	public static  void main(String[] args) {
		String str="123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		
		str="1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
	}
}*/

//6-23
class ex10{
	public static int max(int[] array) {
		if(array==null||array.length==0)
			return -9999999;
		
		int max = array[0];
		
		for(int i=1;i<array.length;i++) {
			if(array[i]>max)
				max = array[i];
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최댓값  : "+max(data));
		System.out.println("최댓값 : "+max(null));
		System.out.println("최댓값 : "+max(new int[] {}));
	}
}
