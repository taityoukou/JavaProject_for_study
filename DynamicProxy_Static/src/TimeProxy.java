
public class TimeProxy implements Moveable,Stopable{
	Moveable t;
	
	public TimeProxy(Moveable t) {
		super();
		this.t = t;
	}

	@Override
	public void move() {
		System.out.println("Time loging...");
		t.move();
	}

	@Override
	public void stop() {
		System.out.println("Stop");
	}

}
