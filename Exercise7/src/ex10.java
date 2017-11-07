//7-10
class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	final int Max_Volume = 100;
	final int Min_Volume = 0;
	final int Max_Channel = 100;
	final int Min_Channel = 1;
	
	public void setVolume(int Volume) {
		if(volume>Max_Volume||volume<Min_Volume)
			return;
		
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setChannel(int channel) {
		if(channel>Max_Channel||channel<Min_Channel)
			return;
		
		this.channel = channel;
	}
	
	public int getChannel() {
		return channel;
	}
}

public class ex10 {
	public static void main(String args[]) {
		MyTv2 t2 = new MyTv2();
		
		t2.setChannel(10);
		System.out.println("CH : "+t2.getChannel());
		t2.setVolume(20);
		System.out.println("VOL : "+t2.getVolume());
	}
}
