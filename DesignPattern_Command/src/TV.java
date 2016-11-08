//命令接收者Receiver
public class TV {
	private int CurrentChannel=0;
	
	public void turnOn(){
		System.out.println("TV turn on!");
	}

	public void turnOff(){
		System.out.println("TV turn off!");
	}
	
	public void changeChannel(int channel){
		setCurrentChannel(channel);
		System.out.println("Channel changed to "+channel);
	}

	public int getCurrentChannel() {
		return CurrentChannel;
	}

	public void setCurrentChannel(int currentChannel) {
		CurrentChannel = currentChannel;
	}
}
