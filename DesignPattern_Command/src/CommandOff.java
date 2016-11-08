//关机命令
public class CommandOff implements Command{

	private TV tv;
	
	public CommandOff(TV tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.turnOff();
		
	}

	@Override
	public void execute(int channel) {
		// TODO Auto-generated method stub
		
	}

}
