import com.lz_java.entity.Order;
import com.lz_java.entity.User;
import com.lz_java.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

public class UserTest {
    @Test
    public void getUserOrdersTest() throws IOException
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = (UserMapper) ctx.getBean("userMapper");

        User user = userMapper.getUserById(1);

        System.out.println("获取用户 ID=1 的用户名："+user);

        System.out.println("得到用户id为1的订单列表：");
        System.out.println("========================");

        List<Order> orders = userMapper.getUserOrders(1);
        for(Order o : orders) {
            System.out.println("订单号：" + o.getOrder_no() + ", 订单金额：" + o.getCost());
        }
    }
}
