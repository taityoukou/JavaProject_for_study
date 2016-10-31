//添加时间记录的代理类
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {
	private Object targetObject;

	public TimeHandler(Object targetObject) {
		super();
		this.targetObject = targetObject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("start...time=xxx");
		Object result = method.invoke(targetObject, args);
		System.out.println("end.....time=xxx");
		
		return result;
	}
}
