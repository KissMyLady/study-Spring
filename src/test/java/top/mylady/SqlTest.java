package top.mylady;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.mylady.pojo.Order;
import top.mylady.pojo.User;
import top.mylady.service.UserService;

import java.util.List;



@RunWith(SpringRunner.class)
@SpringBootTest
public class SqlTest {

    private static final Logger logger = LoggerFactory.getLogger(SqlTest.class);

    @Autowired
    private UserService userService;

    /**
     * 一对一关联查询
     */
    @Test
    public void sqlTest(){
        List<Order> orders = userService.findAllOrder();
        orders.forEach( (order) -> {
            System.out.println("遍历order: "+ order);
        });
        /* 打印结果如下 :
        *[Order
        * (id=40, createTime=Fri Oct 05 17:13:36 CST 2018, order_id=1048139125951172608,
        *   user=User(id=40, username=shiye, password=xxx, phone=null, created=null, salt=null))
        *]
        * */
    }

    /**
     * 一对多关联查询
     */
    @Test
    public void sqlTest2(){
        List<User> users = userService.f_User_leftJoin_Order();

        users.forEach( (user) -> {
            System.out.println("遍历order: "+ user);
        });
        /* 遍历如下:
        *User(id=40, username=shiye, password=xxx, phone=null, created=null, salt=null,
        * orders=[Order(id=40, createTime=Fri Oct 05 17:13:36 CST 2018, order_id=1048139125951172608, user=null)])
        * */
    }
}
