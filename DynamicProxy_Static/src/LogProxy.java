
public class LogProxy implements Moveable{
	Moveable t;
	
	public LogProxy(Moveable t) {
		super();
		this.t = t;
	}

	@Override
	public void move() {
		System.out.println("Log loging...");
		t.move();
		
	}

}
