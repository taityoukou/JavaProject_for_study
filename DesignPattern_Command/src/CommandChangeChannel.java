//换频道命令
public class CommandChangeChannel implements Command{

	private TV tv;
	
	public CommandChangeChannel(TV tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		//
	}

	@Override
	public void execute(int channel) {
		tv.changeChannel(channel);
		
	}

}
