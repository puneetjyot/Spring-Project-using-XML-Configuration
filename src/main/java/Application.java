import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nagarro.services.CustomerService;
import com.nagarro.services.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService= applicationContext.getBean("customerService",CustomerService.class);
		System.out.println(customerService.findAll().get(0).getFirstname());
		
		
		
	}

}
