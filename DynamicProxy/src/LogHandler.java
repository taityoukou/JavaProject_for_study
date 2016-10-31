//添加LOG的代理类
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {
	private Object targetObject;

	public LogHandler(Object targetObject) {
		super();
		this.targetObject = targetObject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("log start...");
		Object result = method.invoke(targetObject, args);
		System.out.println("log end.....");
		
		return result;
	}
}
