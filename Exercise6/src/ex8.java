//6-20
/*class ex8 {
	public static int[] shuffle(int[] array) {
		if(array==null||array.length==0)
			return array;
		
		for(int i=0;i<array.length;i++) {
			int j = (int)(Math.random()*array.length);
			
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
		return array;
	}
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}*/

//6-21
class MyTv{
	boolean ispowerOn;
	int channel;
	int volume;
	
	final int Max_Volume = 100;
	final int Min_Volume = 0;
	final int Max_Channel = 100;
	final int Min_Channel = 1;
	
	void turnOnOff() {
		ispowerOn = !ispowerOn;
	}
	
	void volumeUp() {
		if(volume<Max_Volume)
			volume++;
	}
	
	void volumeDown() {
		if(volume>Min_Volume)
			volume--;
	}
	
	void channelUp() {
		if(channel==Max_Channel) {
			channel = Min_Channel;
		}
		else {
			channel++;
		}
	}
	
	void channelDown() {
		if(channel==Min_Channel) {
			channel=Max_Channel;
		}
		else {
			channel--;
		}
	}
}

class ex8{
	public static void main(String args[]) {
		MyTv t = new MyTv();
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH : "+t.channel+", VOL : "+t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH : "+t.channel+", VOL : "+t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH : "+t.channel+", VOL : "+t.volume);
	}
}