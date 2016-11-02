public class Proxy implements Sourceable {

	private Source source;

	public Proxy() {
		super();
		this.source = new Source();
	}

	@Override
	public void method() {
		before();	//在被代理对象之前加入指定方法（包装）  
		source.method();	//执行原来的方法。
		atfer();	//在被代理对象之前加入指定方法（包装）
	}

	private void atfer() {
		System.out.println("after proxy!");
	}

	private void before() {
		System.out.println("before proxy!");
	}
}