//开机命令
public class CommandOn implements Command{

	private TV tv;
	
	public CommandOn(TV tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.turnOn();
		
	}

	@Override
	public void execute(int channel) {
		// TODO Auto-generated method stub
		
	}

}
