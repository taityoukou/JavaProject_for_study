
public class Client {

	public static void main(String[] args) {
		Tank t=new Tank();
		t.move();
		System.out.println("--------Tank\n");
		
		TimeProxy ttp = new TimeProxy(t);
		ttp.move();
		ttp.stop();
		System.out.println("--------TimeProxy\n");
		
		LogProxy tlp = new LogProxy(ttp);
		tlp.move();
		
		System.out.println("--------LogProxy\n");
		
		
	}
	
	

}
