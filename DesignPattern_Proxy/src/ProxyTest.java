public class ProxyTest {

	public static void main(String[] args) {
		Sourceable source = new Proxy();
		source.method();
	}
	
/* 输出结果如下：
 *  before proxy!
	the original method!
	after proxy!
*/	
	
//该例子是静态代理，还有动态代理（可以对多个方法统一添加代理，不用一个一个的在方法前后添加语句。使用反射机制实现）
//Spring的AOP（切面编程），就是使用代理模式实现的。
	
/*	代理模式的应用场景：
	如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种办法：
	1、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则。
	2、采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。

	使用代理模式，可以将功能划分的更加清晰，有助于后期维护！
	
*/}