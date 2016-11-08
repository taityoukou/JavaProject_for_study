//可以看作是遥控器Invoker 
public class Control {

	private Command onCommand, offCommand,changeCommand;

	public Control(Command onCommand, Command offCommand, Command changeCommand) {
		super();
		this.onCommand = onCommand;
		this.offCommand = offCommand;
		this.changeCommand = changeCommand;
	}
	
	public void turnOn(){
		onCommand.execute();
	}
	
	public void turnOff(){
		offCommand.execute();
	}
	
	public void changeChannel(int channel){
		changeCommand.execute(channel);
	}
	
}
