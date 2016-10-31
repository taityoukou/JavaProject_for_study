import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anson.model.User;
import com.anson.service.UserService;

public class UserServiceTest {

	//@Test 
	//public void testAdd() throws Exception {
	public static void main(String[] args){
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		UserService service = (UserService)ctx.getBean("userService");
//		System.out.println(service.getClass());
		
		for (int i=1;i<20;i++){
			service.add(new User("zhangsan"+i,"2341"+i*2));
		}
		
		ctx.destroy();
		ctx.close();
		
	}
	
}
