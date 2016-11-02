public class SourceSub1 extends Wrapper2 {
	
	@Override
	public void method1() {
		System.out.println("the sourceable interface's first Sub1!");
	}

	// 下面的方法可以不实现
	/*
	 *  @Override
	 * public void method2() { 
	 * 		System.out.println("the sourceable interface's first Sub1's mothod2"); 
	 * }
	 */
}