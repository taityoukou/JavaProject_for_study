//执行命令的接口
public interface Command {

	public void execute();
	
	public void execute(int channel);
}
