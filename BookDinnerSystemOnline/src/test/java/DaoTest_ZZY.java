
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rcyyd.bookdinner.domain.Cart;
import com.rcyyd.bookdinner.domain.Order;
import com.rcyyd.bookdinner.service.CartService;
import com.rcyyd.bookdinner.service.OrderService;

public class DaoTest_ZZY {
	
	private static ApplicationContext ctx = null;		// IoC����(������󼰶���������ϵ�Ĺ���)
	
	@BeforeClass
	public static void setUpBeforeClass() {
		ctx = new ClassPathXmlApplicationContext("app.xml");
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		if (ctx instanceof ClassPathXmlApplicationContext) {
			((ClassPathXmlApplicationContext) ctx).destroy();
		}
	}
	
	@Test
	public void CartDaoTest(){
		CartService cs = (CartService)ctx.getBean(CartService.class);
		//�������
		for (int i = 0; i < 5; i++){
			Cart c = new Cart();
			c.setDishid(i);
			c.setUserid(i);
			c.setCount(i);
			cs.addToCart(c);
		}
		//ɾ������
		for (int i = 0; i < 5; i++){
			Cart c = new Cart();
			c.setDishid(i);
			c.setUserid(i);
			c.setCount(i);
			System.out.println(cs.deleteFromCart(c));
		}
	}
	
	@Test
	public void OrderDaoTest(){
		OrderService os = (OrderService)ctx.getBean(OrderService.class);
		for (int i = 0; i < 5; i++){
			Order o = new Order();
			o.setUserid(i);
			o.setDate(new Date());
			o.setAddrid(i);
			o.setOrdernum("sss");
			o.setStatusid(i);
			o.setOrderid(i);
			os.addToOrder(o);
		}
	}
}
