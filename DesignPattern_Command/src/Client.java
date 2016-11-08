//测试类Client
public class Client {

	public static void main(String[] args) {
		// 命令接收者Receiver
		TV tv = new TV();
		// 命令Command 
		CommandOn onCommand = new CommandOn(tv);
		CommandOff offCommand = new CommandOff(tv);
		CommandChangeChannel changeCommand = new CommandChangeChannel(tv);
		// 命令控制对象Invoker
		Control control = new Control(onCommand, offCommand, changeCommand);
		
		// 开机 ,切换指定频道，关机
		control.turnOn();
		control.changeChannel(3);
		control.turnOff();

	}

}
