//������
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestProxy {

	public static void main(String[] args){
		UserManagerImpl userMgr = new UserManagerImpl();
		LogHandler log = new LogHandler(userMgr);
		TimeHandler time = new TimeHandler(log);
		
		UserManager user =(UserManager)Proxy.newProxyInstance(log.getClass().getClassLoader(), userMgr.getClass().getInterfaces(), log);
		user.addUser();
		user.delUser();
		
		System.out.println("-------");
		
		UserManager user2 =(UserManager)Proxy.newProxyInstance(time.getClass().getClassLoader(), userMgr.getClass().getInterfaces(), time);
		//����  �������������ʵ��
		user2.addUser();
		user2.delUser();
		
	}
}
