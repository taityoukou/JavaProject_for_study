public class MyBridge extends Bridge {

	@Override
	public void method() {
		
		getSource().method();
		
//		this.getSource().method();
//		可以用“this.方法名”来引用当前对象的某个方法，但这时this不是必须的，
//		你可以直接用方法名来访问那个方法，编译器会知道你要调用的是那一个
		
	}

}